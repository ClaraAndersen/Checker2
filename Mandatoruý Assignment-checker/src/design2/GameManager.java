/*
 * By Atli and Clara
 */
package design2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameManager {
	
	static int position_x;
	static int position_y;
	static int newPosition_x;
	static int newPosition_y;

	//Method which handles the user inputs, describing the move the user wish
	//to perform, and transform this in to an array of Coordinates, where the
	//first entry represent the coordinate from where the piece should be moved
	//and the second the coordinate to which it should be moved
	public static Coordinate[] playersMove() {
		
		Scanner scan = new Scanner(System.in);
		boolean t = true;
		while(t) {
			try {		
				System.out.println("Coordinate of piece to move");
				System.out.println("Enter X: ");

				position_x = scan.nextInt();
				t = false;
			}
			catch(InputMismatchException e) {
				scan.nextLine();
				System.out.println("ERROR. You can only input integers");
			}
		}


		t = true;
		while(t) {
			try {		
				System.out.println("Enter Y: ");
				position_y = scan.nextInt();
				t = false;
			}
			catch(InputMismatchException e) {
				scan.nextLine();
				System.out.println("ERROR. You can only input integers");

			}
		}


		Coordinate oldPosition=new Coordinate(position_x,position_y);


		t = true;
		while(t) {
			try {
				System.out.println("New X position");
				newPosition_x = scan.nextInt();
				t = false;
			}
			catch(InputMismatchException e) {
				System.out.println("ERROR. You can only input integers");
				scan.nextLine();

			}
		}


		t = true;
		while(t) {
			try {
				System.out.println("New Y position");
				newPosition_y = scan.nextInt();
				t = false;
			}
			catch(InputMismatchException e) {
				System.out.println("ERROR. You can only input integers");
				scan.nextLine();
			}
		}

		Coordinate newPosition=new Coordinate(newPosition_x,newPosition_y);		

		Coordinate[] move=new Coordinate[] {oldPosition,newPosition};
		return move;
	}

	//change status of currentPlayer in a Board game, to the next player
	public static void nextPlayer(BoardGame game) {
		//find index of currentPlayer
		for(int i=0; i<game.players.length;i++) {
			if(game.players[i].equals(game.currentPlayer)) {
				if(i==game.players.length-1) {
					game.currentPlayer=game.players[0];
				}
				else {
					game.currentPlayer=game.players[i+1];
				}
				break;
			}
		}
	}
}


//references
//testing user input:https://stackoverflow.com/questions/24414299/java-scanner-exception-handling