public class CloneWars {
	public static final void main(final String[] args) {
		final int[] a = new int[4];
		final int[] b = a.clone();
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.length);
	}
}
