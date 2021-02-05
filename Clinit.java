public class Clinit {
	static {
		System.out.println("Hello from clinit!");
	}

	public static void main(final String[] args) {
		_clinit_();
	}

	public static void _clinit_() {}
}
