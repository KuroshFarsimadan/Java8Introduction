class ExampleGenericClass<TypeElementOrWhateverName> {
	// Object otherValue;
	private TypeElementOrWhateverName otherName;
	
	public void setOtherName(TypeElementOrWhateverName n) {
		this.otherName = n;
	}
	
	public TypeElementOrWhateverName getOtherName() {
		return this.otherName;
	}
	
	public String tester() {
		return this.getClass().getName();
	}
}


public class Generics {

	public static void main(String[] args) {
		
		ExampleGenericClass<String> objectExample = new ExampleGenericClass<String>();
		objectExample.setOtherName("Bla bla");
		System.out.println(objectExample.getOtherName());
		
		
		Object easierWay = new Object();
		easierWay = 1;
		System.out.println(easierWay);
		
	}

}
