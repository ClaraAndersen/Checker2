
public class Game {
	Player currentPlayer;
	Board board;
	
	public Player getCurrentPlayer(){
		return this.currentPlayer;
	}
	
	public void setCurrentPlayer(Player newPlayer) {
		this.currentPlayer = newPlayer;
	}
	
	public Board getBoard() {
		return this.board;
	}
	
	
	public static void StartGame(Board board) {
//
//		int i,j;
//		for(i=1 ; i<9 ; i++) {
//			for(j=1 ; j < 9; j++) {
//				// Starting positions for Player 1's pieces.
//				if (i%2!=0 && i<=3 && j%2==0 && j<=8 && 2<=j) {board.getBoard()[i][j]="1";}
//				else if (i%2==0 && i<=3 && j%2!=0 && j<=8 && 1<=j) {board.getBoard()[i][j]="1";}
//				// Starting positions for Player 2's pieces.
//				else if (i%2!=0 && 6<=i && j%2==0 && j<=8 && 2<=j) {board.getBoard()[i][j]="2";}
//				else if (i%2==0 && 6<=i && j%2!=0 && j<=8 && 1<=j) {board.getBoard()[i][j]="2";}		
//			}	
//		}
	}


	public static void main(String[] args) {
		Board board = new Board();
		StartGame(board);
		board.printBoard();
	}


}
