package day24inheritanceoverriding;

public class Vehicle {

	public void move() {
		
		System.out.println("Vehicles move");
		
	}
	public void engine() {
		System.out.println("Vehicles have engine");
	}
	
	public int  spend() {
		return 11;
	}
	public Object speak() {
		return "Hello...";
	}
	public String greet() {
		return "Hello World";
	}
	
	
}
