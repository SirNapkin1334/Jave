public class Clear {
	public static void main(final String[] args) throws InterruptedException {
		System.out.println("Clearing in 3...");
		Thread.sleep(3);
		System.out.print("\f");
		System.out.flush();
		System.out.println("Cleared!");
	}
}
