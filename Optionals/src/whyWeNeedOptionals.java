import java.util.Optional;

public class whyWeNeedOptionals {

	static Integer simpleIntA = 10;

	static Integer simpleIntB = null;

	public static void main(String[] args) {

		// System.out.println(methodWithoutOptionalWhichBreaks());

		System.out.println(methodWithoutOptional());

		System.out.println(methodWithOptional());

	}

	public static int methodWithoutOptionalWhichBreaks() {

		return simpleIntA + simpleIntB;

	}

	public static int methodWithoutOptional() {

		// will not break the system but does not return usable information if one of
		// the values is null

		if (!(simpleIntA == null) && !(simpleIntB == null)) {

			return simpleIntA + simpleIntB;

		}
		return -1;

	}

	public static int methodWithOptional() {

		Optional<Integer> simpleIntAOpt = Optional.ofNullable(simpleIntA);

		Optional<Integer> simpleIntBOpt = Optional.ofNullable(simpleIntB);

		return simpleIntAOpt.orElse(5) + simpleIntBOpt.orElse(5);

	}

}
