package Strings;

public class Strings {

	public static void main(String[] args) {
		String s = "Testing a string";
		s.concat("More stuff to test");
		System.out.println(s);
						//0123456789 10
		String testing = "012345P6789";
		
		System.out.println(testing.substring(6, 8));
		
		System.out.println(testing.length());
		
		String testing2 = "0123456789banana";
		String[] vanDammeSplit = testing2.split("b");
		
		for(int i = 0; i < vanDammeSplit.length; i++ ) {
			System.out.println(vanDammeSplit[i]);
		}

	}

}
