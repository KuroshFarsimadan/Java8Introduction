package Conditionals;

public class Tester2 {

	public static void main(String[] args) {

		double a = 1.22222222;

		float c = 2.444f;
		float b = (float) 2.444;

		System.out.println(a + " " + c + " " + b);
		System.out.println((10 % 20));

		int y = 2;
		int o = 3;
		int j = y + o;

		System.out.println(j);
		j = y - o;

		System.out.println(j);

		j = y / o;
		System.out.println(j);

		System.out.println("***************************");

		int tester1 = 0;
		System.out.println(tester1++);
		System.out.println(tester1++);
		System.out.println(++tester1);
		System.out.println(++tester1);
		System.out.println(tester1++);

		System.out.println(1 != 1); // flase
		System.out.println(1 != 2); // true
		System.out.println(1 == 2); // false
		System.out.println(1 >= 2); // false
		System.out.println(1 <= 2); // true
		System.out.println(1 < 2); // true

		System.out.println((1 > 2) && (2 > 2));
		System.out.println((3 > 2) && (3 > 2));

		boolean trueVal = true;
		boolean falseVal = false;

		System.out.println("***************************");

		System.out.println(trueVal && falseVal);
		System.out.println(trueVal || falseVal);
		System.out.println(!falseVal);
		System.out.println(!trueVal);
		System.out.println((trueVal && !falseVal) || falseVal);

		System.out.println("***************************");

		int max, n1 = 10, n2 = 20, n3 = 30;
		// System.out.println()
		boolean positive = (n1 > 0) ? true : false; // true;
		System.out.println("Is number positive: " + positive);

		int first = 2;
		int second = 20;
		int third = 20;

		if (first >= second && first >= third) {
			System.out.println("First is one the biggest value " + first);
		}

		if (second >= first && second >= third) {
			System.out.println("Second is one of the biggest value " + second);
		}
		if (third >= first && third >= second) {
			System.out.println("Third is one of the biggest value " + third);
		}

		if (!(third >= first && third >= second) && !(second >= first && second >= third)
				&& !(first >= second && first >= third)) {

			System.out.println("Error state");
		}

		int degrees = 24;

		if (degrees < 25) {
			System.out.println("Failed");
		} else if (degrees >= 25 && degrees < 74) {
			System.out.println("B");
		} else if (degrees >= 75 && degrees < 90) {
			System.out.println("A");
		} else {
			System.out.println("S");
		}

		degrees = 1;
		
		// Switch statement
		switch (degrees) {
		
		// If degrees variable value is 1
		case 1:
			System.out.println("Case is 1");
			break;
		
		// If degrees variable value is 2
		case 2:
			System.out.println("Case is 2");
			break;
			
		// If degrees variable value is 3
		case 3:
			System.out.println("Case is 3");
			break;
		
		// If degrees variable value is 4
		case 4:
			System.out.println("Case is 4");
			break;
			
		// If the degrees variable value does not match any of the case values.
		default:
			System.out.println("Case is default");
			break;
			
		}
	}

}
