public class Averager {
	public static void main(String[] args) {
		double[] weekHighs = {80, 70, 75, 69, 72, 74, 90};
		double averageHighs = (weekHighs[0] + weekHighs[1] + weekHighs[2] + weekHighs[3] + weekHighs[4] + weekHighs[5] + weekHighs[6]) / 7;
		System.out.println("Average is: " + averageHighs);
	}
}
