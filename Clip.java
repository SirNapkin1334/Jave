public class Clip {
	public static void main(final String[] args) {
		final java.awt.datatransfer.StringSelection selection = new java.awt.datatransfer.StringSelection("deez nuts");
		java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, selection);
	}
}
