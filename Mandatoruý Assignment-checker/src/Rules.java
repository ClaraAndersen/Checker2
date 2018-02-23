public class Rules {

	public static boolean onBoard(Position p) {
		if((p.getX() >= 1 && p.getX() <= 8) && (p.getY() >= 1 && p.getY() <= 8)){
			return true;
		}
		return false;
	}

	public static boolean diagonalMove(Piece piece, Position newPosition) {
		Player player1=new Player("1");
		Player player2=new Player("2");
		return( 
				//testing if move is diagonal
				((piece.getPosition().getX()%2==0 && newPosition.getX()%2!=0) ||
						(newPosition.getX()%2==0 && piece.getPosition().getX()%2!=0)) &&

				//testing if move is forward
				((piece.getOwner()==player1 && newPosition.getY()==piece.getPosition().getY()+1) ||
						(piece.getOwner()==player2 && newPosition.getY()==piece.getPosition().getY()-1))

				);
	}
	
	public static boolean ownership(Game game, Piece piece) {
		return
		(game.getBoard().getBoard()[piece.getPosition().getY()][piece.getPosition().getX()]==game.getCurrentPlayer().toString());
	}
	
	public static boolean isEmptySpace(Game game, Position position) {
		return (game.getBoard().getBoard()[position.getY()][position.getX()]==" ");
		
	}
}
