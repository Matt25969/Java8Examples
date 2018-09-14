import java.util.ArrayList;
import java.util.List;

public class Streams1 {

	public static List stringCollection = new ArrayList<>();

	public static void method() {

		stringCollection.add("aaa");
		stringCollection.add("Aaa");
		stringCollection.add("bbb");
		stringCollection.add("Bbb");
		stringCollection.add("aabb");

		stringCollection.stream().sorted().forEach(System.out::println);
	}

}
