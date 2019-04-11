import java.util.Iterator;
import java.util.TreeSet;

public class Treesets {

	public static void main(String[] args) {

		TreeSet<String> names = new TreeSet<String>();

		names.add("Mike");
		names.add("John");
		names.add("Jim");

		Iterator<String> iter = names.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
