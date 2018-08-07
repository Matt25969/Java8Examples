public class Logic {

	public static void main(String[] args) {

		Logic log = new Logic();

		MathOperation subtraction = (a, b) -> a - b;

		System.out.println("10 - 5 = " + log.operate(10, 5, subtraction));

		StringOperation removingLast2Chars = s -> s.substring(0, s.length() - 2);

		System.out.println(log.operate("This", removingLast2Chars));

	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface StringOperation {
		String operation(String s);
	}

	private String operate(String s, StringOperation stringOperation) {

		return stringOperation.operation(s);

	}

}
