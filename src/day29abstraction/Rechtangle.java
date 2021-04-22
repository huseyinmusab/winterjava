package day29abstraction;

public class Rechtangle extends Shape {
	
	/*
    If you want to create a CONCRETE-sub-class of an "abstract class" you have to override all
    abstract methods. These overridden methods are concrete now you may implement their body.
   
    Overriding concrete methods is  OPTIONAL
    */


	@Override
	public int area(int height, int length) {
		// TODO Auto-generated method stub
		return height*length;
	}

	
	@Override
	public int perimeter(int height, int length) {
		
		return 2*height*length;
	}

	
	@Override
	public void colour() {

		System.out.println("I want a blue rechtangle");
	}


	//not abstract method,overriding is optional 
	@Override
	public void draw() {

		super.draw();
	}
	
	
	
}
