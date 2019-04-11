import java.util.ArrayList;


public class Arraylists {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Bob");
		list.add("Mike");
		list.add("John");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
