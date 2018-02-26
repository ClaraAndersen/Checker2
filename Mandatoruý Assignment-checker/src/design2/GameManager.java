package design2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameManager {
	static Scanner scan = new Scanner(System.in);
	static int position_x;
	static int position_y;
	static int newPosition_x;
	static int newPosition_y;

	public static int getPosition_x() {
		try {
			return position_x = scan.nextInt();	
		}
		catch(InputMismatchException e) {
			System.out.println("ERROR. You can only input integers");
		}
		return position_x;
	}

	public static int getPosition_y() {
		try {
			return position_y = scan.nextInt();	
		}
		catch(InputMismatchException e) {
			System.out.println("ERROR. You can only input integers");
		}
		return position_y;
	}

	public static int getNewPosition_x() {
		try {
			return newPosition_x = scan.nextInt();	
		}
		catch(InputMismatchException e) {
			System.out.println("ERROR. You can only input integers");
		}
		return newPosition_x;
	}

	public static int getNewPosition_y() {
		try {
			return newPosition_y = scan.nextInt();	
		}
		catch(InputMismatchException e) {
			System.out.println("ERROR. You can only input integers");
		}
		return newPosition_y;
	}

// TEST
}

