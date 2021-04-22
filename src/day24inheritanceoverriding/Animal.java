package day24inheritanceoverriding;

public class Animal {
	
	int height;
	int weight;
	
	
	public Animal() {
		System.out.println("Animal constructor without parameter");
	}
	
	public Animal(int a) {
		System.out.println("Animal constructor with int parameter");
		
	}
	
	public Animal(int height, int weight) { 
		this.height=height;
		this.weight=weight; //look at the colors
		
		
	}
	

}
