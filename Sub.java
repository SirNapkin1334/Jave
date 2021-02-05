public class Sub extends Super {
	@Override public void handleMouseInput() {
		System.out.println("Handled.");
		super.handleMouseInput();	
	}
}
