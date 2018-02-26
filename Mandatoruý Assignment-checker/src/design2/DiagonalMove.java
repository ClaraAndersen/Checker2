package design2;

public class DiagonalMove implements Move {
	Player player1=new Player("1");
	Player player2=new Player("2");
	public boolean isValidMove(Piece piece, Coordinate newPosition){
		return( 
				//testing if move is diagonal
				((piece.getPosition().getX()%2==0 && newPosition.getX()%2!=0) ||
						(newPosition.getX()%2==0 && piece.getPosition().getX()%2!=0)) &&

				//testing if move is forward
				((piece.getOwner()==player1 && newPosition.getY()==piece.getPosition().getY()+1) ||
						(piece.getOwner()==player2 && newPosition.getY()==piece.getPosition().getY()-1))

				);
	}

}
