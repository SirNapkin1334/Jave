
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class Unexpected {

	public static void main(String[] args) throws Exception {
		Unexpected.behaviour();
		int x = 2;
		System.out.println("2 + 2 = 4");
		System.out.println("2 + 2 = " + (x + 2));
	}

	private static void behaviour() throws Exception {
		int dummyLol = 0x6969;
		dummyLol += 0x6969;
		dummyLol += 0x6969;
		// We don't actually use any of that stuff, it just emits some easy-to-find bytecode
		Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
		unsafeField.setAccessible(true);
		Unsafe unsafe = (Unsafe) unsafeField.get(null);
		// This is the bytecode we generated earlier. Thankfully for us, the jvm decides to store it quite close to the main bytecode
		byte[] targetBytes = {0x11, 0x69, 0x69, 0x3B, (byte) 0xC4, (byte) 0x84, 0x00, 0x00, 0x69, 0x69, (byte) 0xC4, (byte) 0x84, 0x00, 0x00, 0x69, 0x69};
		long startOffset = 0x20000000; //TODO: Maybe get this dynamically somehow?
		long x = 0;
		byte[] currentMatch = new byte[targetBytes.length]; // Current bytes which we are considering
		outer:
		while (true) {
			for (int i = 1; i < currentMatch.length; i++) {
				currentMatch[i - 1] = currentMatch[i]; // Shift everything back one
			}
			currentMatch[currentMatch.length - 1] = unsafe.getByte(startOffset + x);
			x++;
			for (int i = 0; i < currentMatch.length; i++) {
				if (currentMatch[i] != targetBytes[i]) {
					continue outer; // If these bytes don't match, our overall sequence can't. Try again
				}
			}
			break;
		}
		// We've found our bytecode, now we just have to read back until we find `ILOAD_1 ICONST_2 IADD`
		startOffset += x;
		targetBytes = new byte[]{0x1B, 0x05, 0x60};
		currentMatch = new byte[targetBytes.length];
		x = 0;
		secondOuter:
		while (true) {
			currentMatch[2] = currentMatch[1]; // Shift everything forward 1
			currentMatch[1] = currentMatch[0];

			currentMatch[0] = unsafe.getByte(startOffset + x);
			x--; // We're going backwards this time
			for (int i = 0; i < currentMatch.length; i++) {
				if (currentMatch[i] != targetBytes[i]) {
					continue secondOuter; // Same comparison shenanigans as before
				}
			}
			unsafe.putByte(startOffset + x + 1, (byte) 0x06); // Begone ICONST_2, hello ICONST_3
			return; // Done! :D
		}
	}
}
