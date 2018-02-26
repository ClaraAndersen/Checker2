package design2;

abstract class Game {
	Player[] players;
	Player currentPlayer;
	
	public Player getCurrentPlayer(){
		return currentPlayer;
	}
	
	public void setCurrentPlayer(Player newPlayer) {
		currentPlayer=newPlayer;
	}
	
	abstract void startGame();

}
