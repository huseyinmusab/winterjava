package day24inheritanceoverriding;

public class Audi extends Car{
	
	/*
	 * 1)If you change the method body of a method which is in parent class
	 * before using in Child Class, it is "method overriding"
	 * 
	 * 2) In method overriding we do not create a new method .We changed the implemantation to use it.
	 * 
	 * 3)In method overrriding you can not change the method name and method parameters(method signature)
	 * Note: method name +method parameter =method signature.So we can not change method signature
	 * 
	 */

	public void price() {
		System.out.println("Audi is expensive");
	}

	@Override
	public void move() {
		System.out.println("Audi moves very fast");
		super.move();
	}
	
	
	
	//Can i use both overriden and overriding method in child class
	
}
