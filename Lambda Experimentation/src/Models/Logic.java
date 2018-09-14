package Models;

public class Logic {

	MathOperation subtraction = (a, b) -> a - b;

	StringOperation removingLast2Chars = s -> s.substring(0, s.length() - 2);

	public int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface StringOperation {
		String operation(String s);
	}

	public String operate(String s, StringOperation stringOperation) {

		return stringOperation.operation(s);

	}

}
