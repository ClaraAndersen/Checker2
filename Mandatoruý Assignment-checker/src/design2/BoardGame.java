package design2;

public class BoardGame extends Game {	
	static String[][] board;
	int rows;
	int columns;
	
	//constructor
	public BoardGame(int x, int y, Player[] players){
		rows=y+2;
		columns=x+2;
		this.players=players;
		currentPlayer=players[0];		
		this.board = new String[rows][columns];
		

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
	
	public String[][] getBoard() {
		return board;	
	}
	
	//displaying board
	public static void printBoard() {
			for(int i=0 ; i<10 ; i++) {
				for(int j=0 ; j < 10; j++) {
					System.out.print(board[i][j]+" ");
				}
				System.out.println("");	}
		}
	
	public void startGame() {
		int n1=1;
		int n2=1;
		for(int i=1 ; i<rows-1 ; i++) {
			for(int j=1 ; j < columns-1; j++) {
				// Starting positions for Player 1's pieces.
				if (i%2!=0 && i<=3 && j%2==0 && j<=8 && 2<=j) 
					{board[i][j]="1";
					Coordinate c=new Coordinate(j,i);
					Piece p=new Piece(players[0],c);
					}
					
				else if (i%2==0 && i<=3 && j%2!=0 && j<=8 && 1<=j) 
					{board[i][j]="1";
					Coordinate c=new Coordinate(j,i);
					Piece p=new Piece(players[0],c);
					}
				
				// Starting positions for Player 2's pieces.
				else if (i%2!=0 && 6<=i && j%2==0 && j<=8 && 2<=j) 
					{board[i][j]="p";
					Coordinate c=new Coordinate(j,i);
					Piece p=new Piece(players[1],c);
					}
				else if (i%2==0 && 6<=i && j%2!=0 && j<=8 && 1<=j) 
					{board[i][j]="2";
					Coordinate c=new Coordinate(j,i);
					Piece p=new Piece(players[1],c);
					}
				}				
			}
		}
	
	public void nextPlayer() {
		
		
	}
		
	public static void main(String[] args) {
		Player player1=new Player("1");
		Player player2= new Player("2");
		Player[] playerList=new Player[] {player1,player2};
		BoardGame checker=new BoardGame(8,8,playerList) ;
		checker.startGame();
		//Create a new GameManger
		GameManager gameManager= new GameManager();
		while(true) {
			printBoard();
			System.out.println("Turn of player no. "+ currentPlayer);
			Coordinate currentPosition=gameManager.playersMove()[0];
			Coordinate newPosition=gameManager.playersMove()[1];
			
			
			
//			GameManger.nextPlayer();
			
		}
	}
}
		

