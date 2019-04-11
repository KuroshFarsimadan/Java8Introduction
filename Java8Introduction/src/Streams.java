import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		example1();
		example2();
		example3();
	}

	public static void example1() {

		List<String> listItems = Arrays.asList("Kurosh", "Farsi", "Madan");

		List<String> result = listItems.stream()
		.filter(line -> !"Farsi".equals(line))
		.collect(Collectors.toList());

		result.forEach(System.out::println);
	}

	public static void example2() {

		String[] words = { "Car", "Horse", "Sloth", "Apartment" };

		Arrays.stream(words).
		filter(x -> x.startsWith("C"))
		.sorted()
		.forEach(System.out::println);

	}
	
	public static void example3() {
		
		String[] words = { "Car", "Horse", "Sloth", "Apartment" };
		
		Arrays.stream(words).
		filter(x -> x.startsWith("C"))
		.map(x -> x.toLowerCase())
		.sorted()
		.forEach(System.out::println);
		
	}

}
