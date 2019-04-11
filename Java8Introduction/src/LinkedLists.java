import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {

		LinkedList<String> linklist = new LinkedList<String>();

		linklist.add("Mike");
		linklist.add("John");
		linklist.add("Bob");
		linklist.add("Jimbob");

		Iterator<String> itr = linklist.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		LinkedList<Integer> linkedlist2 = new LinkedList<Integer>();
		
		linkedlist2.add(1);
		linkedlist2.add(2);
		linkedlist2.add(3);
		
		Iterator<Integer> iterator = linkedlist2.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		LinkedList<String> stringlist = new LinkedList<String>();
		stringlist.add("oh");
		stringlist.add("oh");
		stringlist.add("ah");
		
		Iterator<String> iter = stringlist.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
