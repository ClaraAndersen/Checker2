/*
 * By Atli and Clara
 */
package design2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardGameTest {

	@Test
	public void testStartGame() {
		Player player1=new Player("1");
		Player player2= new Player("2");
		Player[] playerList=new Player[] {player1,player2};
		BoardGame checker1=new BoardGame(8,8,playerList) ;
		checker1.startGame();
		BoardGame checker2=new BoardGame(8,8,playerList) ;
		checker2.board[1][2]="1";
		checker2.board[1][4]="1";
		checker2.board[1][6]="1";
		checker2.board[1][8]="1";
		checker2.board[2][1]="1";
		checker2.board[2][3]="1";
		checker2.board[2][5]="1";
		checker2.board[2][7]="1";
		checker2.board[3][2]="1";
		checker2.board[3][4]="1";
		checker2.board[3][6]="1";
		checker2.board[3][8]="1";
		checker2.board[6][1]="2";
		checker2.board[6][3]="2";
		checker2.board[6][5]="2";
		checker2.board[6][7]="2";
		checker2.board[7][2]="2";
		checker2.board[7][4]="2";
		checker2.board[7][6]="2";
		checker2.board[7][8]="2";
		checker2.board[8][1]="2";
		checker2.board[8][3]="2";
		checker2.board[8][5]="2";
		checker2.board[8][7]="2";
		assertEquals("should be the same",BoardGame.board,checker2.board);
	}

}
