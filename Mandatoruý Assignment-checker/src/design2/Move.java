package design2;

public interface Move {
	public boolean isValidMove(Coordinate oldPosition, Coordinate newPosition, BoardGame game);
	public void move(Coordinate oldPosition, Coordinate newPosition, BoardGame game);


}
