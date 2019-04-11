package loops;

public class Prime {

	public static void main(String[] args) {
		
		for(int i = 2; i < 100; i++) {
			boolean prime = true;
			for(int b = 2; b < i; b++) {
				
				if( i != 2 ) {
					if(i%b == 0) {
						prime = false;
					}
				}	
			}
			System.out.println(i + " " + prime);
		}

	}

}
