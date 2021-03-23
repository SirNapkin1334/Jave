public class Initializers {
	public final int num = 1;
	public final String _const = "Foo";
	public final String notConst = new Object().toString();
	public final java.lang.invoke.MethodHandle o = null;
	{
		System.out.println("I am an initializer!");
	}
	{
		System.out.println("I am the second initializer!");
	}
	public Initializers() {
		System.out.println("Hello from contructor");
	}
	public static void main(final String[] args) {
		System.out.println("Hello, World!");
		new Initializers();
	}
}
