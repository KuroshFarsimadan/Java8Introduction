package InheritanceAccessModifiers;

public class Vehicle {
	
	static public void publicMethod() {
		
	}
	
	static protected void protectedMethod() {
		
	}
	
	static private void privateMethod() {
		System.out.println("private method");
	}
	
	static void defaultMethod() {
		
	}
	
	
	
	public static void main(String[] args) {
		privateMethod();
	}

	

	

}
