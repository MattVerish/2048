import java.util.Arrays;
import java.util.Scanner;

import objects.Grid;
// Test comment to see if eclipse will work like this
public class TextPlayer {

	private static int _base;
	private static int _size;
	private static Grid _board;
	public static void main(String...strings) {
		setup();
		_board = new Grid(_size);
		_board.addNum(_base);
		play();
	}
	
	private static void setup() {
		Scanner in = new Scanner(System.in);
		System.out.println("How large would you like the board to be?");
		_size = Integer.parseInt(in.nextLine());
		System.out.println("What base would you like the game to use?");
		_base = Integer.parseInt(in.nextLine());
	}
	
	static void play() {
		Scanner in = new Scanner(System.in);
		String command;
		while(!_board.gameOver()); {
			_board.print();
			System.out.println("Print ya move bitch.");
			command = in.nextLine().trim().toLowerCase();
			
		}
	}
	
	static boolean processCommand(String in) {
		switch(in) {
		case "down":
			downCommand();
			return true;
		case "right":
			rightCommand();
			return true;
		case "up":
			upCommand();
			return true;
		case "left":
			leftCommand();
			return true;
		default:
			System.out.println("No command of that name found, bitch");
			return false;
		}
			
	}

	private static void leftCommand() {
		// TODO Auto-generated method stub
		
	}

	private static void upCommand() {
		// TODO Auto-generated method stub
		
	}

	private static void rightCommand() {
		// TODO Auto-generated method stub
		
	}

	private static void downCommand() {
		// TODO Auto-generated method stub
		
	}
}
