
class Dog {
	public void bark() {
		System.out.println("Woof");
	}
}

public class AnonymousClassGermanShepherd {

	public static void main(String[] args) {
		
		// Child anonymous inner class overriding parent
		Dog anonymousInnerClass = new Dog() {
			public void bark() {
				System.out.println("Woof?");
			}
		};
		anonymousInnerClass.bark();

	}

}
