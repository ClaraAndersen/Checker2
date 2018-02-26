//
//public class Move {
//	
//	public static void move(Position newPosition, Piece piece, Game game) {
//		if(Rules.onBoard(newPosition) && 
//				Rules.ownership(game, piece) && 
//				Rules.diagonalMove(piece, newPosition) && 
//				Rules.diagonalMove(piece, newPosition)){
//			game.getBoard().getBoard()[newPosition.getY()][newPosition.getX()] = game.getCurrentPlayer().toString();
//			game.getBoard().getBoard()[piece.getPosition().getY()][piece.getPosition().getX()] = " ";
//			piece.setPosition(newPosition);
//		}
//		
//		
//		
//	}
//}
