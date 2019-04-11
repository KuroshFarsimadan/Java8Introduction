package InheritanceAccessModifiers;

// If you want to extend the extends must come before implements
public class CarImpl extends Vehicle implements Car {
	
	private int id = 1;
	
	private String model = "ModelName";

	public int getId() {
		return id;
	}


	public String getModel() {
		return model;
	}
	

	
}
