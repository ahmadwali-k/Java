public class BAD2 {
	public static void main(String[] args) {
	int a = 1331;
	int b = 0;
	System.out.println("Welcome to \nCS 1331!");
	try {
		int c = a/b;
		System.out.println(" c is equal to: " + c);
	} catch (ArithmeticException e) {
	System.out.println("cannot divide by zero");
	}

	}
}
