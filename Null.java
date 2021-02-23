public class Null {
	public static void print() { System.out.println("Hello! World,"); }

	public static void main(final String[] args) {
		final Null theNull = null;
		theNull.print();
		((Null) null).print();
	}
}
