import java.util.Scanner;
public class FahrenToCelsieus {
	public static void main(String[] args) {
	final int max_temp = 140;
	final int min_val = 70;
	final int max_val = 90;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a Fahrenheit value: ");
	int fahrenheit = input.nextInt();

	while (fahrenheit >= max_temp) {
		System.out.println("Error: the fahrenheit value must be lower than " + max_temp);
		System.out.println("Please enter another fahrenheit value: ");
		fahrenheit = input.nextInt();
	}
	
	System.out.print("Enter a day of the week: ");
	String day = input.next();
	System.out.print("Enter your prefered Celsius label (Celsius, Centigrade, or C): ");
	String cText = input.next();
	double celsius = (5.0/9) * (fahrenheit -32);
	
	
	//System.out.println(day + "fahrenheit: " + fahrenheit);
	//System.out.println(day + "Celsius: " + celsius);
	System.out.printf("%s Fahrenheit: %d\n", day, fahrenheit);
	//System.out.printf("%s Celsius: %.1f\n", day, celsius);
	System.out.printf("%s %10s: %.1f \n", day, cText, celsius);
	// with a space of 10 or -10 to adjust the title infront, and adding , after %,.1 can help with separation and .1 decimal places

	if ((fahrenheit >= min_val) && (fahrenheit <= max_val))  {
		
		//using boolean condition
	        boolean raining = false;
        	System.out.println("is it raining (y/n): ");
        	String rainInput = input.next().toLowerCase();

	        	if (rainInput.startsWith("y")) {
                	raining = true;
        		}
			System.out.println("yay! go to park");
		

		if (raining) {
			System.out.println("look up fun things to do in the rain");
		} else {
		
			System.out.println("time to go to park");
		}
	} 
	System.out.println("bye");
	}
}
