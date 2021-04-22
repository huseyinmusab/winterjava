package day24inheritanceoverriding;

public class Mammal extends Animal {
	public boolean haveBaby;
	public int height;
	
	public Mammal() {
		super(5);
		
		
		/*
		 * 1) To create an object you can use just a single constructor
		 * 2)super() keyword must be in the first line inside the constructor
		 * 3)You can use super() just once in a constructor
		 * 4)If you make a constructor call for a non-existing constructor from parent class, you will get compile time error.
		 * 5)this()===>calls the constructors inside the class itself ,navigate inside the class
		 * 6)super() ===> calls the constructors from parent class,navigate outside the class
		 * 
		 */
		//there is an invisible suoer() here definetly
		System.out.println("Mammal constructor without parameter");
	}

	//you cant call 2 constructor at the same time for only one object
	
	
	
	public Mammal(boolean haveBaby) {
		//**here is there is nothing===> means super();+++. and tha means we are calling Animal();
		//**if we write super() ,it is the same thing===>Animal();
		//** if it was super(3,4);===>public Animal(int height, int weight) {} shows yhird constructor
		super(3,4);
		this.haveBaby=haveBaby;
		
	}
}
