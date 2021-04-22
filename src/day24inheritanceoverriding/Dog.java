package day24inheritanceoverriding;


public class Dog extends Mammal{
	public boolean smellWell;
	
	
	public Dog() {
		super(); //If you type super() it is fine.if you don not type java puts it automatically
		
		System.out.println("Dog constructor without paramater");
	}
	
	public Dog(boolean smellWell) {
		super(true);
		//If you do not any constructor call inside the first line 
		//Java uses the parent constructor without parameter automatically
		
		/*
		 * super() is for parent constructors call
		 * super. is for parent variable call
		 */
		
		
		
		//super.haveBaby=true;
		//super.height=11;
		//super.weight=22;   //updating
		
		//super.height; ===> ReturnS the height value from parent clasess (Animal)
		//this.height====>   Returns the height value from calss itself (Dog)
		
		//If you have multiple variables whos enames are same in different parent classes
		//super keyword selects the closest one
		
		
		//super.
		this.smellWell=smellWell;
		
	}

}
