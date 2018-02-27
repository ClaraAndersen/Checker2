/*
 * By Atli and Clara
 */

package design2;

public class BoardGame extends Game {	
	static String[][] board;
	static int rows;
	static int columns;

	//constructor
	public BoardGame(int x, int y, Player[] players){
		rows=y+2;
		columns=x+2;
		this.players=players;
		currentPlayer=players[0];		
		board = new String[rows][columns];

		//creating boarder on board
		int i,j; // i = row and j = column
		for(i=0 ; i<rows ; i++) {
			for(j=0 ; j < columns; j++) {
				//Add boarders
				if (j==0||j==columns-1) {
					board[i][j] = "|";
				}
				if (i==0||i==rows-1) {
					board[i][j] ="_";
				}
				else if (board[i][j] == null){ 
					board[i][j] = " ";
				}

			}
		}
	}


	//displaying board
	public static void printBoard() {
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j < columns; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println("");	}
	}

	
	//Placing piece on board in initial position
	public void startGame() {

		for(int i=1 ; i<rows-1 ; i++) {
			for(int j=1 ; j < columns-1; j++) {
				// Starting positions for Player 1's pieces.
				if (i%2!=0 && i<=3 && j%2==0 && j<=8 && 2<=j) 
				{board[i][j]="1";
				}

				else if (i%2==0 && i<=3 && j%2!=0 && j<=8 && 1<=j) 
				{board[i][j]="1";
				}

				// Starting positions for Player 2's pieces.
				else if (i%2!=0 && 6<=i && j%2==0 && j<=8 && 2<=j) 
				{board[i][j]="2";
				}
				else if (i%2==0 && 6<=i && j%2!=0 && j<=8 && 1<=j) 
				{board[i][j]="2";
				}
			}				
		}
	}

	//main executing the actual board game
	public static void main(String[] args) {
		Player player1=new Player("1");
		Player player2= new Player("2");
		Player[] playerList=new Player[] {player1,player2};
		BoardGame checker=new BoardGame(8,8,playerList) ;
		checker.startGame();
		GameManager gameManager= new GameManager();
		
		while(true) {
			printBoard();
			System.out.println("Turn of player no. "+ currentPlayer.name);
			Coordinate[] move=gameManager.playersMove();
			Coordinate currentPosition=move[0];
			Coordinate newPosition=move[1];
			DiagonalMove myMove=new DiagonalMove();
			//checking it move is valid
			if(myMove.isValidMove(currentPosition, newPosition, checker)){
				//move piece
				myMove.move(currentPosition, newPosition, checker);
				//change player
				gameManager.nextPlayer(checker);
			}
			else {
				System.out.println("You did not enter a valid move");
			}		
		}
	}
}


