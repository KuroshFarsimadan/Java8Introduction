import java.util.ArrayList;
import java.util.HashMap;

public class InheritanceTester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human car1 = new Human();
		car1.setAge(10);
		car1.setName("Bob");
		
		Human car2 = new Human();
		car2.setAge(15);
		car2.setName("Jim");
		
		Human car3 = new Human();
		car3.setAge(20);
		car3.setName("Mike");
		

		ArrayList<Human> list = new ArrayList<Human>();
		
		list.add(car1);
		list.add(car2);
		list.add(car3);
		
		HashMap<String, ArrayList>  hm= new HashMap<String, ArrayList>();
		
		hm.put("Humans", list);
		
		
		// Now we want to print few car details
		for(int i = 0; i < hm.get("Humans").size(); i++) {
			Human output = (Human) hm.get("Humans").get(i);
			System.out.println(output.getName());
		}
		
		
		// Overriding parent (Vehicle) method
		car1.print();
		

	}

}
