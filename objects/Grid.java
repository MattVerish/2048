package objects;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

import utils.Direction;

public class Grid {

    private Number[][] _board;
    private int _size;
    private Random _generator = new Random();

	public Grid(int dimensions) {
		_board = new Number[dimensions][dimensions];
		_size = dimensions;
	}
	
	public void print() {
		for (int i = 0; i < _size; i++) {
			for (int j = 0; j < _size; j++) {
				try {
                    System.out.print(_board[i][j].getNum() + " ");	
				} catch(NullPointerException e) {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
	
	private ArrayList<Point> emptyLocs() {
		ArrayList<Point> toReturn = new ArrayList<Point>();
		for (int i = 0; i < _size; i++) {
			for (int j = 0; j < _size; j++) {
				if (_board[i][j] == null) {
					toReturn.add(new Point(i, j));
				}
			}
		}
		return toReturn;
	}
	
	public void addNum(int base) {
		ArrayList<Point> empty = this.emptyLocs();
		Point randomLoc = empty.get(_generator.nextInt(empty.size()));
		_board[randomLoc.x][randomLoc.y] = new Number(base);
	}
	
	public boolean gameOver() {
		for (int i = 0; i < _size; i ++) {
			for (int j = 0; j < _size; j++) {
				if (hasEqualAdjacent(new Point(i, j))) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean hasEqualAdjacent(Point in) {
		int num = _board[in.x][in.y].getNum();
		ArrayList<Point> neighbors = new ArrayList<Point>();
		Direction dir = Direction.UP;
		while (dir != null) {
			neighbors.add(new Point(in.x + dir.getDeltaX(), in.y + dir.getDeltaY()));
			dir = dir.next();
		}

		for (Point temp : neighbors) {
			try {
				Number tempNum = _board[temp.x][temp.y];
				if (num == tempNum.getNum()) {
					return true;
				}
			} catch (IndexOutOfBoundsException e) {
				continue;
			}
		}
		return false;
	}
	
	private Number getFirst(Direction dir, Point start) {
		int num = _board[start.x][start.y].getNum();
		int x = start.x + dir.getDeltaX();
		int y = start.y + dir.getDeltaY();
		while ((0 <= x && x < _size) && (0 <= y && y < _size)) {
			try {
				Number temp = _board[x][y];
				if (temp != null) {
					return temp;
				}
			} catch (NullPointerException e) {
				continue;
			}
			x += dir.getDeltaX();
			y += dir.getDeltaY();
		}
	    return null;
	}
	
	public void moveLeft() {
		for (int i = 0; i < _size; i++) {
			for (int j = 1; j < _size; j++) {
				
			}
		}
	}
	
	public void moveRight() {
		
	}
	
	public void moveUp() {
		
	}
	
	public void moveDown() {
		
	}
}
