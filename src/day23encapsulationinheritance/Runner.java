package day23encapsulationinheritance;

public class Runner {

	public static void main(String[] args) {

		Dog dog1= new Dog();
		
		dog1.Bark();//
		dog1.drink();//dog1 inherited drink() from animal class
		dog1.eat();//dog1 inherited drink() from animal class
		dog1.giveBirth();//dog1 inherited giveBirth() from Mammal class
			
		
		
	}

}
