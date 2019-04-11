import java.util.HashSet;
import java.util.Iterator;

public class HashSets {

	public static void main(String[] args) {
				
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		
		System.out.println(hs.contains(1));
		
		hs.remove(1);
		
		System.out.println(hs);
		
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
