import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Runner {

	public static void main(String[] args) {
		myFirstMethod();
		System.out.println("-------------------------------------");
		System.out.println(checkAString("this", "this"));
		System.out.println("-------------------------------------");
		System.out.println(checkStringWithLambda("this", "this"));
		System.out.println("-------------------------------------");
		System.out.println(stringBiCheck.test("this", "this"));
		System.out.println("-------------------------------------");
		takesTwoInputs(5, 5, "a");
		System.out.println("-------------------------------------");

		System.out.println("-------------------------------------");
		helloLambdaWithStream();
		System.out.println("-------------------------------------");
		basicLoop();
		System.out.println("-------------------------------------");
		collectionLoop();
		System.out.println("-------------------------------------");
		iterateLoop();
		System.out.println("-------------------------------------");
	}

	public static void myFirstMethod() {
		System.out.println("HelloWorld");
	}

	public static String mySecondMethod() {

		return "HelloWorld";
	}

	public static String myThirdMethod(String input) {

		return input;
	}

	public static int addFunction(int a, int b) {

		return a + b;
		// sub

		// divide
		// mult easy beans

	}

	public static boolean checkAString(String inputA, String inputB) {

		// do an easier one to begin with

		if (inputA.equals(inputB)) {

			return true;

		} else {
			return false;
		}

	}

	public static double takesTwoInputs(int a, int b, String choice) {

		switch (choice) {

		case "a":
		case "add":
			System.out.println(a + b);
			return a + b;

		}
		return -1;

	}

	// write this - so what the hell is this folks
	static Consumer<String> helloLambda = s -> System.out.println(s);

	public static void helloLambdaWithStream() {

		List<String> tempList = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {

			tempList.add(i + 9 + "");

		}

		tempList.stream().forEach(helloLambda);

	}

	public static boolean checkStringWithLambda(String inputA, String inputB) {

		BiPredicate<String, String> stringBiCheck = (String s1, String s2) -> {
			return s1.equals(s2);
		};

		return stringBiCheck.test(inputA, inputB);

	}

	static BiPredicate<String, String> stringBiCheck = (String inputA, String inputB) -> {
		return inputA.equals(inputB);
	};

	static BiFunction<Integer, Integer, Integer> addFunction = (a, b) -> {
		return a + b;
	};

	public static void basicLoop() {

		for (int i = 0; i < 10; i++) {

			System.out.println(i);

		}
	}

	public static void collectionLoop() {

		List<Integer> tempList = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {

			tempList.add(i + 9);

		}

		System.out.println(tempList.size());
	}

	public static void iterateLoop() {

		List<Integer> tempList = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {

			tempList.add(i);

		}

		for (Integer i : tempList) {

			System.out.println(i * 10);

		}

	}

}
