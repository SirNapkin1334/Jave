public class poopfile {
	
	private final String foo;

	private int bar = 0;

	public static void main(final String[] args) {
		final poopfile $ = new poopfile("beef city$");
		if (args.length > 1) {
			try {
				$.setBar(Integer.parseInt(args[0]));
			} catch (Throwable ignored) {} // fuck if i know what the exception is called
		}
		System.out.println($.baz());
	}

	public poopfile(final String foo) {
		this.foo = foo;
		System.out.println("Initialized new poopfile: " + foo);
	}

	public String getFoo() {
		return foo;
	}

	public int getBar() {
		return bar;
	}

	public void setBar(final int bar) {
		this.bar = bar;
	}

	public String baz() {
		if (bar == 0) return "";
		final StringBuilder builder = new StringBuilder(foo);
		for (int i = bar; i --> 1;) { // poggers
			builder.append(foo);
		}
		return builder.toString();
	}
}
