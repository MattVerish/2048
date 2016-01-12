package objects;

import java.awt.Component;

public class Number extends Component{

	private int _number;

	public Number(int in) {
		_number = in;
	}
	
	public int getNum() {
		return _number;
	}
	
}
