public class Contructor {
	private final String these = "knutes";
	private final String deez;
	static {
		System.out.println("Hello from <clinit>!");
	}
	{
		String s = "where am I";
		s += '?';
		System.out.println(s);
	}

	public Contructor() {
		System.out.println(1);
		deez = "nuts";	
		System.out.println(2);
	}
	public Contructor(final String deez) {
		System.out.println(3);
		this.deez = deez;
		System.out.println(4);
	}

	public static void main(final String[] args) {
		new Contructor();
		new Contructor("those");
	}

}
