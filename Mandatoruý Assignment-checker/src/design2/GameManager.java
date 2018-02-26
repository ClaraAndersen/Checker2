package design2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameManager {
	static Scanner scan = new Scanner(System.in);
	static int position_x;
	static int position_y;
	static int newPosition_x;
	static int newPosition_y;

	public static void PlayersMove() {
		try {
			System.out.println("Current X position");
			position_x = scan.nextInt();

			System.out.println("Current Y position");
			position_y = scan.nextInt();

			System.out.println("New X position");
			newPosition_x = scan.nextInt();

			System.out.println("New Y position");
			newPosition_y = scan.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("ERROR. You can only input integers");
		}
	}

}

