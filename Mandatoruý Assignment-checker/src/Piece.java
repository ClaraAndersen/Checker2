
public class Piece {
	Player owner;
	Position position; 
	
	
	public Position getPosition() {
		return this.position;
	}
	
	public Player getOwner() {
		return this.owner;
	}
	
	public void setPosition(Position newPosition) {
		this.position = newPosition;
	}
}
