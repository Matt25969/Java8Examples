import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		String test = "Clive";

		ArrayList<String> people = new ArrayList<>();

		people.add(test);
		people.add("Jeff");
		people.add("Tom");
		people.add("Bob");
		people.add("Bert");
		people.add("Ted");

		people.forEach(System.out::println);

		System.out.println("----------------------------------------");

	}

}
