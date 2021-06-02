public class In implements I2 {
	public static void main(final String[] args) {
		((I2) new In()).test();
	}

	@Override public void test() { System.out.println(0); }
}

interface I1 {
	void test();
}

interface I2 extends I1 {
	void test();

}

