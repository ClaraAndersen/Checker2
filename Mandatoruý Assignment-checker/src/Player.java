
public class Player {
	String name;
	
	Player(String i){
		name=i;
	}
	
	public static void changePlayer(Game currentPlayer){
		Player player1=new Player("1");
		Player player2=new Player("2");
		if (currentPlayer.getCurrentPlayer()==player2) {
			currentPlayer.setCurrentPlayer(player1);
			}
		else currentPlayer.setCurrentPlayer(player2);;
		return;
	}
}
