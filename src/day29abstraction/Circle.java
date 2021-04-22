package day29abstraction;

public class Circle extends Shape {
	
	 /*
    We created a concrete sub class of an abstract class, we override all the abstract methods
    but we didn't override the concrete method. Overriding concrete methods is optional
    */

	@Override
	public int area(int radius, int pi) {

		pi = (int) Math.PI;
		return pi*radius*radius;
	}

	@Override
	public int perimeter(int radius, int pi) {
		
		pi=(int) Math.PI;
		
		return 2*pi*radius;
	}

	@Override
	public void colour() {

		System.out.println("I want a pink circle");
		
	}
	
	

}
