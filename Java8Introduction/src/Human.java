public class Human extends Animal implements HumanInterface {

	private String name;

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// For overriding vehicle class method
	public void print() {
		System.out.println("Human says hello ");
	}

	@Override
	public int interfaceMethod() {
		return age;
		// TODO Auto-generated method stub

	}

}
