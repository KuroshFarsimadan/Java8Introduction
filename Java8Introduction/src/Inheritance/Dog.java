package Inheritance;

import java.util.HashMap;

import InheritanceAccessModifiers.Car;
import InheritanceAccessModifiers.CarImpl;

public class Dog extends Animal implements Interface1, Interface2{
	
	public void move() {
		System.out.println("Dogs can walk and run");
	}
	
	public static void main(String[] args) {
		
	}
	
}
