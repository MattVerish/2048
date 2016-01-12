package gui;

public class RandomTests {

	public static void main(String...strings) {
		GameGui test = new GameGui("This is a test", true);
		System.out.println(test.getHeight());
		System.out.println(test.getWidth());
		test.display(true);
	}
}
