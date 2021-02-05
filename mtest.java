public class mtest {

	private String theText = "";

	public void keyTyped(char typedChar, int keyCode) {
		if (keyCode == 0xE && theText.length() > 0) {
			theText = theText.substring(0, theText.length() - 1);
		} else if (keyCode > 31 && keyCode < 127) {
			theText = new StringBuilder(theText).append(typedChar).toString();
		}
		System.out.println((int) typedChar);
	}
}
