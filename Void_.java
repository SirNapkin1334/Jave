public class Void_ {
	public static void main(final String[] args) throws Throwable {
		final java.lang.reflect.Constructor c = Void.class.getDeclaredConstructor();
		c.setAccessible(true);
		final Void v = (Void) c.newInstance();
		final Integer i = 0;
		die(i);
	}
	public static void die(final int i) {
		System.out.println("you made it this far");
		System.out.println("I am doing the thing" + (Object) i);
		System.out.println((Object) i);
	}
}
