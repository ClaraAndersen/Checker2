/*
 * by Atli and Clara
 */
package design2;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameManagerTest {

	@Test
	public void testNextPlayer() {
		GameManager gameManager = new GameManager();

		Player player1 = new Player("1");
		Player player2 = new Player("2");
		Player[] players = new Player[] {player1, player2};

		BoardGame boardGame = new BoardGame(8, 8, players);

		boardGame.startGame();
		gameManager.nextPlayer(boardGame);
		assertEquals("Should be equal ", boardGame.currentPlayer.name, "2");
		gameManager.nextPlayer(boardGame);
		assertEquals("Should be equal ", boardGame.currentPlayer.name, "1");
	}

}
