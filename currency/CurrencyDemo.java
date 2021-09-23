import java.util.Scanner;
import java.text.NumberFormat;
public class CurrencyDemo {
public static void main(String[] args) {

	int items;
	double costPerItem, total;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of items: ");
	items = input.nextInt();
	System.out.print("Enter the cost per item: ");
	costPerItem = input.nextDouble();
	total = items * costPerItem;
	System.out.println();
	System.out.println("Unformatted Total: " + total);
	NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
	System.out.println("Formatted Total: " + currencyFormat.format(total));
	}
}
	
