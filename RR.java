public class RR {
	
	public static void test1() {}
	public static void test2() {}

	public static void main(final String[] args) {
		double total = 0;
		for (int x = 1000; x --> 0; ++x) {
			final long start = System.nanoTime();
			test1();
			total += (start - System.nanoTime()) / 1_000_000;
		}

	}
}
