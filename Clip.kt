fun main() {
	val selection = java.awt.datatransfer.StringSelection("deez nuts")
	java.awt.Toolkit.getDefaultToolkit().systemClipboard.setContents(selection, selection)
}
