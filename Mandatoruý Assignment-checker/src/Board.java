
public class Board {
	String[][] board;
	public Board(){
		
		board = new String[10][10];

		int i,j; // i = row and j = column
		for(i=0 ; i<10 ; i++) {
			for(j=0 ; j < 10; j++) {
				//Add boarders
				if (j==0||j==9) {
					board[i][j] = "|";
				}
				if (i==0||i==9) {
					board[i][j] ="_";
				}
				else if (board[i][j] == null){ 
					board[i][j] = " ";
				}

			}
		}
	}
	
	public String[][] getBoard() {
		return this.board;
		
	}
	
	//displaying board
	public void printBoard() {
		//first loop goes through rows second through columns.
		for(int i=0 ; i<10 ; i++) {
			for(int j=0 ; j < 10; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println("");	}
	}
}


