import java.util.Optional;

public class Optional1 {

	public static void method() {

		Optional optional = Optional.of("Bert");

		System.out.println("------------------------------------------------------------");

		System.out.println(optional.isPresent());

		System.out.println("------------------------------------------------------------");

		System.out.println(optional.get());

		System.out.println("------------------------------------------------------------");

		System.out.println(optional.orElse("Something Else"));

		System.out.println("------------------------------------------------------------");

		optional.ifPresent(s -> System.out.println(((String) s).charAt(2)));

		System.out.println("------------------------------------------------------------");

	}

}
