package day13constructors;

public class Animal {
	/*
	 * 1)Constructors must have the same name with the class
	 * 2)Constructor names start with uppercases(Because they match with the class name but method name starts with lower cases
	 * 3)Methods must have "return type", but Constructors must not
	 */
	
	public String name ="Joe";
	public int weight = 78;
	public static boolean isHerbivorous = false;
	
	public static void main(String[] args) {

		Animal dog = new Animal();
		
		System.out.println(dog.name);
		System.out.println(dog.weight);//78
		System.err.println(dog.isHerbivorous);//false
		
		dog.move();  // why they are giving yellow underline
		dog.eat();
		dog.drink();
	
		 
	}
	public static void eat() {
		if(isHerbivorous) {
					System.out.println("Eats plants");
            }else {
            	System.out.println("Eats both plants and meat");
            }
		
	}
	
	
	public static void drink() {
		System.out.println("drinks water");
	}
	public static void move() {
		System.out.println("moves");
	}
	
	
}
