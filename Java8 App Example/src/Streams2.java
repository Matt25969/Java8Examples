import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Streams2 {

	public static List stringCollection = new ArrayList<String>();

	public static void method() {

		stringCollection.add("aaa");
		stringCollection.add("Aaa");
		stringCollection.add("bbb");
		stringCollection.add("Bbb");
		stringCollection.add("aabb");
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("ccc");
		stringCollection.add("aaa1");

		System.out.println("------------------------------------------------------------");

		stringCollection.stream().filter(s -> ((String) s).startsWith("a")).forEach(System.out::println);

		System.out.println("------------------------------------------------------------");

		stringCollection.stream().sorted().filter(s -> ((String) s).startsWith("a")).forEach(System.out::println);

		System.out.println("------------------------------------------------------------");

		stringCollection.stream().map(s -> ((String) s).toUpperCase())
				.sorted((a, b) -> ((String) b).compareTo((String) a)).forEach(System.out::println);

		System.out.println("------------------------------------------------------------");

		boolean check = false;

		check = stringCollection.stream().allMatch(s -> ((String) s).startsWith("a"));

		System.out.println(check);
		
		System.out.println("------------------------------------------------------------");

		check = stringCollection.stream().noneMatch(s -> ((String) s).startsWith("z"));

		System.out.println(check);
		
		System.out.println("------------------------------------------------------------");

		Optional reduced = stringCollection.stream().sorted().reduce((s1, s2) -> s1 + "#" + s2);

		reduced.ifPresent(System.out::println);
	}

}
