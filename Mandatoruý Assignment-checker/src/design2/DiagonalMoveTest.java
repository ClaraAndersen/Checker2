/*
 * by Atli and Clara
 */
package design2;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiagonalMoveTest {
	
	@Test
	public void testIsValidMove() {
		Player player1 = new Player("1");
		Player player2 = new Player("2");
		Player[] players = new Player[] {player1, player2};
		
		Coordinate x1 =new Coordinate(2,3);
		Coordinate x2 =new Coordinate(1,4);
		Coordinate x3 =new Coordinate(2,4);
		
	
		BoardGame boardGame = new BoardGame(8,8,players);
		boardGame.startGame();
		DiagonalMove diagonalMove = new DiagonalMove(); 
		assertTrue("Should be legal move", diagonalMove.isValidMove(x1, x2, boardGame) );
		assertFalse("Should be legal move", diagonalMove.isValidMove(x2, x1, boardGame) );
		assertFalse("Should be legal move", diagonalMove.isValidMove(x1, x3, boardGame) );
		
	}
	@Test
	public void testMove() {
		Player player1 = new Player("1");
		Player player2 = new Player("2");
		Player[] players = new Player[] {player1, player2};
		
		Coordinate x1 =new Coordinate(2,3);
		Coordinate x2 =new Coordinate(1,4);
		Coordinate x3 =new Coordinate(2,4);
		
		BoardGame boardGame = new BoardGame(8,8,players);
		boardGame.startGame();
		DiagonalMove diagonalMove = new DiagonalMove(); 
		diagonalMove.move(x1, x2, boardGame);
		assertTrue("Move ", boardGame.board[x1.y] [x1.x]==" ");
		assertTrue("Move ", boardGame.board[x2.y] [x2.x]=="1");
	}

}
