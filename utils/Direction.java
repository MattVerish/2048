package utils;

// Did this work???
public enum Direction {
	UP(1, 0),
	RIGHT(0, 1),
	LEFT(0, -1),
	DOWN(-1, 0);
	
	private final int deltaX;
	private final int deltaY;
	
	private Direction(int y, int x) {
		this.deltaX = x;
		this.deltaY = y;
	}
	
	public int getDeltaX() {
		return deltaX;
	}
	public int getDeltaY() {
		return deltaY;
	}
	
	public boolean hasNext() {
		if (this.next() != null) {
			return true;
		}
		return false;
	}
	
	public Direction next() {
		if (this.equals(Direction.UP)) {
			return Direction.RIGHT;
		} else if (this.equals(Direction.RIGHT)) {
			return Direction.DOWN;
		} else if (this.equals(Direction.DOWN)) {
			return Direction.LEFT;
		} else {
			return null;
		}
	}
	
	
	public boolean equals(Direction toCompare) {
		if (this.getDeltaX() == toCompare.getDeltaX() && this.getDeltaY() == toCompare.getDeltaY()) {
			return true;
		}
		return false;
	}
}
