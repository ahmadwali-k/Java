import java.util.Scanner;
public class Battleship {
	public static int numRows = 5;
	public static int numColumns = 5;
	private static char[][] player = new char[numRows][numColumns];
	private static int player1Ships;
	private static int player2Ships;

	public static void main(String[] args) {
		
	System.out.println("\n Welcome to Battleship! \n");
		
		printBattleShip(player);
		deployPlayer1Ships();

		System.out.println(" \n player 1 ship locations on the grid \n");

		deployPlayer2Ships();
		System.out.println("\n player 2 ship locations on the grid \n");

	}	


	private static void deployPlayer1Ships() {
		Scanner input = new Scanner(System.in);

		System.out.println("PLAYER 1, ENTER YOUR SHIPS' COORDINATES.");
		for (int i = 1; i <= 5; i++) {
	
			System.out.println("Enter ship " + i + " location: ");
			int x = input.nextInt();
			int y = input.nextInt();
			System.out.println("you entered: " + x + " " + y);
			
			if ((x >= 0 && x < numRows) && (y >= 0 && y < numColumns) && (player[x][y] == '-'))
				{
					player[x][y] = '@';
					
				}
			else if ((x >= 0 && x < numRows) && (y >= 0 && y < numColumns) && player[x][y] == '@')
				System.out.println("You already fired on this spot. Choose different coordinate.");
			else if ((x < 0 || x >= numRows) || (y < 0 || y >= numColumns))
				System.out.println("You can't place ships outside the " + numRows + " by " + numColumns + " board");

		}
		printBattleShip(player);
	}
	
	private static void deployPlayer2Ships() {
		Scanner input = new Scanner(System.in);

		System.out.println("PLAYER 2, ENTER YOUR SHIPS' COORDINATES.");
		for (int j = 1; j <= 5; j++) {
			System.out.println("Enter ship " + j + " location: ");
			// int num = input.nextInt();
			// accepts a coordinate
			// grid = input.nextLine().split(" ");
		}		
		
	}
	


	// use this method to print game boards to the console
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + "- " );
				}
			}
		System.out.println("");
		}		

	}
}

