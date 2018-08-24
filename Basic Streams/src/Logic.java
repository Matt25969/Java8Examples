import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Logic {

	public static void main(String[] args) {

		String salutation = "Hello! ";

		GreetingService greetService1 = (message, message2) -> System.out.println(salutation + message + message2);

		greetService1.saySecondMessage("Mahesh", " is the best");

		greetService1.saySecondMessage("Mark", " is the worst");

		Random random = new Random();

		random.ints().limit(10).forEach(System.out::println);

		stringsMethod();

		squaresMethod();

	}

	public static void stringsMethod() {

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		filtered.forEach(System.out::println);

	}

	public static void squaresMethod() {

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());

		System.out.println("-------------------------------------------------------------");
		System.out.println("SquaresList - Before it has been sorted");
		System.out.println("-------------------------------------------------------------");
		squaresList.forEach(System.out::println);
		System.out.println("-------------------------------------------------------------");
		System.out.println("SquaresList - After it has been sorted");
		System.out.println("-------------------------------------------------------------");
		squaresList.stream().sorted().forEach(System.out::println);
		System.out.println("-------------------------------------------------------------");
		System.out.println("SquaresList - After it has been reduced");
		System.out.println("-------------------------------------------------------------");
		// squaresList.stream().reduce(null).forEach(System.out::println);
		System.out.println(squaresList.stream().reduce(0, (a, b) -> a + b));

	}

	interface GreetingService {

		void saySecondMessage(String message, String message2);

	}

	// interface NumberService{
	//
	// void printNumbers()
	//
	// }
}