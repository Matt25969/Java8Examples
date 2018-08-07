import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Logic {

	public static void main(String[] args) {

		List<Optional> optionsList = null;

		Integer a = null;

		Integer b = 0;

		// Optional<Integer> a = Optional.ofNullable(value1);

		Optional<Integer> optA = Optional.ofNullable(a);

		Optional<Integer> optB = Optional.ofNullable(b);

		System.out.println(optB.orElse(3) + optA.orElse(3));

		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

		List<Integer> numberListWithNull = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
				19, 20);

		System.out.println("---- completed the numberList ----");

		// is there a way to work these 3 things together

		NumberService squaring = arg -> arg * arg;

		OptionalService options = arg -> Optional.ofNullable(arg);

		AnotherOptionalService anotherService = arg -> (Integer) arg.orElse(5);

		// I want to put the squaring function here?
		List<Integer> squaredList = numberList.stream().map(i -> i * i).distinct().collect(Collectors.toList());

		List<Integer> squaredListWithLambda = numberList.stream().map(arg -> squaring.operation(arg))
				.collect(Collectors.toList());

		System.out.println("Managed to create squared List With Lambda");
		try {
			optionsList = numberListWithNull.stream().map(arg -> options.operation(arg)).distinct()
					.collect(Collectors.toList());
		} catch (Exception E) {

			E.printStackTrace(System.out);

		}

		System.out.println("Managed to create options list");

		List<Object> affectedList = optionsList.stream().map(arg -> anotherService.operation(arg)).distinct()
				.collect(Collectors.toList());

		squaredListWithLambda.stream().forEach(System.out::println);

		System.out.println("------------------------------------------------");

		affectedList.stream().forEach(System.out::println);

	}

	interface NumberService {
		int operation(int arg);
	}

	interface OptionalService {
		Optional operation(int arg);
	}

	interface AnotherOptionalService {
		Object operation(Optional arg);
	}

}
