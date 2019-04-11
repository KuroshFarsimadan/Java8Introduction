package loops;

public class Tester1 {

	public static void main(String[] args) {
		int[] variableName = {1, 2, 4, 6, 7};
		
		for(int i = 0; i < variableName.length; i++) {
			
			/* if(variableName[i] == 4) {
			 	// Break means that break from the loop altogether
				break;
			} */
			if(variableName[i] == 4) {
				// Continue means that break from the rest of this loop and skip to the next.
				continue;
				
			}
			System.out.println(variableName[i]);
		}

	}

}
