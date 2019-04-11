package Inheritance;

public class MainTester {

	public final static int i = 0;
	public static void main(String[] args) {
		
		final int b;
		b = 10;
		
		/*
		subtract(2);
		
		subtract(2, 4);
		
		subtract(); */
		
		StaticTester t1 = new StaticTester();
		
		StaticTester t2 = new StaticTester();
		
		t1.setI(10);
		System.out.println(t2.getI());
		
		MainTester.subtract();
		
	}
	
	
	public static void subtract(int i) {
		System.out.println(i-1);
	}
	

	public static void subtract(int i, int b) {
		System.out.println(i-b);
	}
	
	public static void subtract() {
		System.out.println(1 -1);
	}
}
