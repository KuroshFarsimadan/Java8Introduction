import java.util.Arrays;
import java.util.List;

public class Lambdas {

	public static void main(String[] args) {
		List<Integer> intVals = Arrays.asList(1, 2, 3, 4, 5);
		
		// Below Array.asList does not work as an array is not a "List"
		// String[] stringVals = Arrays.asList("One", "Two");
		
		intVals.forEach(i -> System.out.println(i));

	}

}
