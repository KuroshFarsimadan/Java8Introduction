import java.util.Arrays;
import java.util.Comparator;

class MySort implements Comparator<Integer> {

	public int compare(Integer x, Integer y) {
		return x.compareTo(y);
	}
}

public class CompareTo {

	public static void main(String[] args) {

		// 2 < 3 -> -1
		int r = new Integer(2).compareTo(3);

		// 3 > 2 -> 1
		int r2 = new Integer(3).compareTo(2);

		System.out.println(r + " " + r2);

		Integer[] primes = { 2, 7, 5, 3 };
		MySort ms = new MySort();
		Arrays.sort(primes, ms);
		for (Integer p2 : primes) {
			System.out.print(p2 + " ");
		}

	}

}
