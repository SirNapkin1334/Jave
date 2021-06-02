public class Converter {
	public static int celsiusToFahrenheit(int celsius) { return celsius * 9/5 + 32; }
	public static int fahrenheitToCelsius(int fahrenheit) { return fahrenheit - 32 * 5/9; }

	public static void main(final String[] args) {
		System.out.println(fahrenheitToCelsius(40));
	}
}

