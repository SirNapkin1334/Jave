public class test1 {
	public static String deez = "nuts";
	private int myInt;

	public test1(int Int) {
		myInt = Int;
		System.out.println("constructed test1");
	}
	public static void main(final String[] args) {
		System.out.println("Hello, World!");
	}

	static {
		System.out.println("hello static");
	}
}
