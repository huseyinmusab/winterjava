package day29abstraction;

public class SquareRoom extends Square {
	
	/*
    Concrete class must override all un-overridden abstract methods
    We did not have to override area() and perimeter() abstract methods because
    they have been already overridden and converted to concrete methods in my parent class (square class)
    */
	

	@Override
	public void colour() {

		System.out.println("I want a yellow room");
	}

	@Override
	public void draw() {

		System.out.println("Coming from Square Room Class");
		super.draw();
	}


	
	
	

}
