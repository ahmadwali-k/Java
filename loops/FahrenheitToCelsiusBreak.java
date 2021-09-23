import java.util.Scanner;

public class FahrenheitToCelsiusBreak {
	public static void main(String[] args) {
		
		final int MIN_TEMP = -200;
		final int MAX_TEMP = 200;

		Scanner input = new Scanner(System.in);

		double totalFahrenheit = 0;
		int validFahrenheits = 0;

		for (int i = 1; i <= 5; i++) {

			System.out.println("Enter a Fahrenheit value: ");
			int fahrenheit = input.nextInt();
			if ((fahrenheit >= MIN_TEMP) && (fahrenheit <= MAX_TEMP)) {
				totalFahrenheit = totalFahrenheit + fahrenheit;
				validFahrenheits++;
			}
			else {
				System.out.println("invalid value ");
				break;
			}

		}
		if (validFahrenheits > 0) {
			System.out.println("Average Fahrenheit Temperature: " + totalFahrenheit/validFahrenheits);
		}
	}
	
}
