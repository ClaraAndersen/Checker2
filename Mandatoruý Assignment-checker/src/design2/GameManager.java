package design2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameManager {
	static Scanner scan = new Scanner(System.in);
	static int position_x;
	static int position_y;
	static int newPosition_x;
	static int newPosition_y;

	public static Coordinate[] playersMove() {
		try {
			System.out.println("Coordinate of piece to move");
			System.out.println("Enter X: ");
			position_x = scan.nextInt();
			
			System.out.println("Enter Y: ");
			position_y = scan.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("ERROR. You can only input integers");
		}
			Coordinate oldPosition=new Coordinate(position_x,position_y);
			
		try {
			System.out.println("New X position");
			newPosition_x = scan.nextInt();

			System.out.println("New Y position");
			newPosition_y = scan.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("ERROR. You can only input integers");
		}
		
		Coordinate newPosition=new Coordinate(newPosition_x,newPosition_y);		
	
	Coordinate[] move=new Coordinate[] {oldPosition,newPosition};
	return move;
	}
	
	
}

