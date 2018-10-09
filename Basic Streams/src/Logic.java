import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

		useOfPeek();

		oldFindMaxMethod();

	}

	public static void useOfPeek() {

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		List<String> peeked = strings.stream().peek(s -> System.out.println("something " + s)).limit(5)
				.collect(Collectors.toList());

		System.out.println(peeked);

		// peeked.forEach(System.out::println);

		Stream.iterate(1, (Integer n) -> n + 1).peek(n -> System.out.println("number generated: - " + n))
				.filter(n -> (n % 2 == 0)).peek(n -> System.out.println("Even number filter passed for - " + n))
				.limit(6).count();

		strings.stream().peek(s -> System.out.println("s : " + s)).limit(5).collect(Collectors.toList());

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

	public static void oldFindMaxMethod() {

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);

		numbers.sort(null);

		System.out.println(numbers.get(numbers.size() - 1));

		System.out.println("-------------------------------------------------");

		numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

		System.out.println("-------------------------------------------------");

		numbers.stream().forEach(System.out::println);

		System.out.println(numbers.stream().max((i, j) -> i.compareTo(j)).toString());

		System.out.println(numbers.stream().min((i, j) -> i.compareTo(j)).toString());

		numbers.stream().map(i -> i * 10).forEach(System.out::println);

		List<Integer> squaredList = numbers.stream().map(i -> i * i).collect(Collectors.toList());

		squaredList.stream().forEach(System.out::println);

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