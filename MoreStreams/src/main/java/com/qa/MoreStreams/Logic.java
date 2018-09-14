package com.qa.MoreStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Logic {

	public static void searchForDataUsingStreams() {

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		System.out.println("---------------------------------------------------------");

		System.out.println(strings.stream().findFirst().get());

		System.out.println("---------------------------------------------------------");

		System.out.println(strings.stream().findAny().get());

		System.out.println("---------------------------------------------------------");

		System.out.println(strings.stream().anyMatch(n -> n.equals("abc")));

		System.out.println("---------------------------------------------------------");

		System.out.println(strings.stream().anyMatch(n -> n.equals("a")));

		System.out.println("---------------------------------------------------------");

		System.out.println(strings.stream().allMatch(n -> n.equals("a")));

		System.out.println("---------------------------------------------------------");

		System.out.println(strings.stream().allMatch(n -> n.getClass().getSimpleName().equals("String")));

		System.out.println("---------------------------------------------------------");

		System.out.println(strings.stream().noneMatch(n -> n.equals("abc")));

		System.out.println("---------------------------------------------------------");

	}

	public static void useOfPeek() {

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		List<String> peeked = strings.stream().peek(s -> System.out.println("something" + s)).limit(5)
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

	interface GreetingService {

		void saySecondMessage(String message, String message2);

	}

}