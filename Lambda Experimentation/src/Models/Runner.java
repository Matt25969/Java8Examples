package Models;

import java.util.function.Function;

public class Runner {

	public static void main(String[] args) {

		Logic log = new Logic();

		System.out.println("10 - 5 = " + log.operate(10, 5, log.subtraction));

		System.out.println("10 + 5 = " + log.operate(10, 5, log.addition));

		System.out.println("10 * 5 = " + log.operate(10, 5, log.multiplication));

		System.out.println(log.operate("This", log.removingLast2Chars));

		InClassOperation ico = s -> "Hello" + s;

		InClassOperation icox = s -> "Hello X" + s;

		Function<String, String> myCons = s -> "myCons" + s;

		System.out.println(myCons.apply("YO"));

		System.out.println(ico.action(" Mark"));

		System.out.println(icox.action(" Mark"));

	}

	interface InClassOperation {
		String action(String s);

	}

}
