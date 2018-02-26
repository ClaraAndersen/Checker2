package design2;

public class DiagonalMove implements Move {
	Player player1=new Player("1");
	Player player2=new Player("2");
	public boolean isValidMove(Coordinate oldPosition, Coordinate newPosition,BoardGame game){
		return( 
				//testing if move is diagonal
				((oldPosition.x%2==0 && newPosition.x%2!=0) ||
						(newPosition.x%2==0 && oldPosition.x%2!=0)) &&

				//testing if move is forward
				(game.currentPlayer==player1 && newPosition.y==oldPosition.y+1) ||
						(game.currentPlayer==player2 && newPosition.y==oldPosition.y-1)&&
		
			//if  new position is empty
						game.board[newPosition.y][newPosition.x]==" "&&
			//if it is players piece	
						game.board[oldPosition.y][oldPosition.x]==game.currentPlayer.name.toString());
	}
	
	public void move(Coordinate oldPosition, Coordinate newPosition,BoardGame game) {
		game.board[newPosition.y][newPosition.x]=game.board[oldPosition.y][oldPosition.x];
		game.board[oldPosition.y][oldPosition.x]=" ";
		
	}

}
