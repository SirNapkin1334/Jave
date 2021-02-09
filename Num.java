public class Num {
	public static void main(final String[] args) {
		//long z = Long.MIN_VALUE;
		//z--;
		//z++;
		//System.out.println(z == 9218868437227405313L);
		//test(z);
		test(Long.MIN_VALUE, 9218868437227405313L);
	}
	private static void test(final long i, final long z) {
		System.out.println(i);
		System.out.println(z);
		System.out.println(i == z);
	}
}
