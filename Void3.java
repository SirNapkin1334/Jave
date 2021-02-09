public class Void3 {
	public static void main(final String[] args) throws Throwable {
		die(0);
	}
	public static void die(final int i) {
		System.out.println("you made it this far");
		System.out.println("I am doing the thing" + (Object) i);
		System.out.println((Object) i);
	}
}
