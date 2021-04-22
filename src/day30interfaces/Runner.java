package day30interfaces;


public class Runner {

	public static void main(String[] args) {

		Dog dog= new Dog();
		
		dog.eat();
		dog.givingBirth();
		dog.sound();
		dog.move();
		
		System.out.println(Animal.NUM);//6
		System.out.println(	Mammals.NUM);//10
		
		/*
        All VARIABLES are STATIC interfaces, because of that we use "interface" name
        to access them.If you use object name to access variables Java will be confused.
        We can access variables by using INTERFACE NAME
        */

		 // System.out.println(dog.AGE);//9 (Not recommended)
            System.out.println(Animal.AGE);//9 (Recommended)
            
        /*
        For unique variables, if you use object to access variable , it works but it is not recommended.
        Instead, access them with interface name.
        */   
	}

}
