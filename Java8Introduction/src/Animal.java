public class Animal {

	private String animalSound;

	// Constructor without parameters = default constructor
	public Animal() {
		super();
	}

	// Constructor with parameter = parameterized constructor
	public Animal(String animalSound) {
		super();
		this.animalSound = animalSound;
	}

	// Set method
	public void setId(String animalSound) {
		this.animalSound = animalSound;
	}

	// Overloading function against setId(String animalSound)
	public void setId(int id, int tester) {

	}

	// Get method
	public String getId() {
		return this.animalSound;
	}

	// For overriding from Car class
	public void print() {
		System.out.println("Animal says " + this.animalSound);
	}

}
