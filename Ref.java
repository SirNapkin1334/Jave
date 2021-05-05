public class Ref {
	public static void hello() {
		System.out.println("Hello, World!");
	}

	public static void main(final String[] args) {
		new Thread(Ref::hello).start();
	}
}
