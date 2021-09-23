public class fahToCel {
	public static void main(String[] args) {
	int saturdayfah;
	int sundayfah;
	sundayfah = 78;
	saturdayfah = 80;
	//Scanner input = new Scanner(System.in);
		double saturdayCel = (5.0/9) * (saturdayfah - 32);
		double sundayCel = (5.0/9) * (sundayfah - 32);
		System.out.println("saturday Celsieus: " + saturdayCel);
		System.out.println("sunday Celsieus: " + sundayCel);
	}
}
