package design2;

public class BoardGame extends Game {
	String[][] board;
	
	Player[] players;
	Player currentPlayer;
	
	//constructor
	public void Board(int x, int y, Player[] players){
		this.players=players;
		currentPlayer=players[0];		
		board = new String[y][x];
		

		int i,j; // i = row and j = column
		for(i=0 ; i<y ; i++) {
			for(j=0 ; j < x; j++) {
				//Add boarders
				if (j==0||j==x-1) {
					board[i][j] = "|";
				}
				if (i==0||i==y-1) {
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
	public void printBoard() {
			for(int i=0 ; i<10 ; i++) {
				for(int j=0 ; j < 10; j++) {
					System.out.print(board[i][j]+" ");
				}
				System.out.println("");	}
		}
	
}
