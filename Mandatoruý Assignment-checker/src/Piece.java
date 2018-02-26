

import design2.Coordinate;
import design2.Player;

public class Piece {
	Player owner;
	Coordinate position;
	
	public Piece(Player player , Coordinate position){
		owner=player;
		this.position=position;
	}
	
	public Player getOwner() {
		return owner;
	}
	
	public Coordinate getPosition(){
		return position;
		
	}
	
	public void setPosition(Coordinate position){
		this.position=position;
	}

}
