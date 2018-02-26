package design2;
public class Piece {
	Player owner;
	Coordinate position;
	
	public Piece(Player player , Coordinate position){
		owner=player;
		this.position=position;
	}
	
	public Coordinate getPosition(){
		return position;
		
	}
	
	public void setPosition(Coordinate position){
		this.position=position;
	}

}
