package Models;

public class Runner {

	public static void main(String[] args) {

		Logic log = new Logic();

		System.out.println("10 - 5 = " + log.operate(10, 5, log.subtraction));

		System.out.println(log.operate("This", log.removingLast2Chars));

	}

}
