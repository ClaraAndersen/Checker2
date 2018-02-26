package design2;

public class DiagonalMove implements Move {
	public boolean isValidMove(Piece piece, Coordinate newPosition){
		return( 
				//testing if move is diagonal
				((piece.getPosition().getX()%2==0 && newPosition.getX()%2!=0) ||
						(newPosition.getX()%2==0 && piece.getPosition().getX()%2!=0)) &&
		
	}

}
