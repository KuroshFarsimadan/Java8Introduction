

public class TernaryOperations {

	public static void main(String[] args) {
		int n1 = 10, n2 = 30, n3 = 30, max, temp, temp2, temp3;

		boolean positive;

		// System.out.println(positive); // variable not initialized

		// If n1 is bigger than 0, then return true, else return false
		positive = (n1 > 0) ? true : false;
		System.out.println("Is the number positive: " + positive);

		positive = (n1 > n2) ? true : false;
		System.out.println("Is the number positive 2: " + positive);

		positive = (n2 > n3) ? true : false;
		System.out.println("Is the number positive 2: " + positive);

		/*
		 * if (n1 >= n2 && n1 >= n3) { System.out.println("N1 is the biggest number"); }
		 * 
		 * if (n2 >= n1 && n2 >= n3) { System.out.println("N2 is the biggest number"); }
		 * 
		 * if (n3 >= n1 && n3 >= n2) { System.out.println("N3 is the biggest number"); }
		 */

		temp = (n1 > n2) ? n1 : n2;

		System.out.println("temp = (n1 > n2) ? n1 : n2; " + temp);

		if (n1 > n2) {
			if (n1 > n3) {

			}
		}

		max = (temp > n3) ? temp : n3;

		System.out.println("max = (temp > n3) ? temp : n3; " + max);

		temp2 = (n2 > n3) ? n2 : n3;

		System.out.println("temp2 = (n2 > n3) ? n2: n3; " + temp2);

	}

}
