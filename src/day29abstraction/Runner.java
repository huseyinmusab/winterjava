package day29abstraction;

public class Runner {

	public static void main(String[] args) {

		Shape rechtangle = new Rechtangle();
		System.out.println(rechtangle.area(3, 7));
		rechtangle.colour(); //why NOT syso,because return type of method is void
		
		
		Circle circle= new Circle();
		System.out.println(circle.area(4, 2));
		
		
		SquareRoom squareRoom =new SquareRoom();
		squareRoom.draw();
		
	}

}
