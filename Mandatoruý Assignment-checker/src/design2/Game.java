package design2;

abstract class Game {
	Player[] players;
	static Player currentPlayer;

	abstract void startGame();
}
