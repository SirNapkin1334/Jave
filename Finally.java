public class Finally {
	public static void main(final String[] args) {
		System.out.println(test());
	}
	private static boolean test() {
		try {
			return true;
		} finally {
			return false;
		}
	}
}
