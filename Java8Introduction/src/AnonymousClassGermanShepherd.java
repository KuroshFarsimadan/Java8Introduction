class Dog {
	public void bark() {
		System.out.println("Woof");
	}
}

// Functional interfaces provide target types for lambda
// expressions and method references. This is a Java 8
// feature
interface DogInterface {
	String bark(String barking);
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

		// String tester = "Woofie";

		DogInterface lambdaJava8Way = (tester) -> {
			return tester;
		};

		System.out.println(lambdaJava8Way.bark("Woofie"));

	}

}
