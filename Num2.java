public class Num2 {
	public static void main(final String[] args) {
		//long z = Long.MIN_VALUE;
		//z--;
		//z++;
		//System.out.println(z == 9218868437227405313L);
		//test(z);
		test(0.0, -0.0);
	}
	private static void test(final double i, final double z) {
		System.out.println(i);
		System.out.println(z);
		System.out.println(i == z);
	}
}
