package day25overridingexceptions;

public class Runner {

	public static void main(String[] args) {

		//Create an object whose data type is Animal and 
		//Constructor is also Animal
		
		//NOTE:
		//If parent class and child class have methods whose names are same,
		//look at the data type to understand which one will be called 
		//if you are trying too access to a variable, you need to check the data type
		// If you are trying to access to a method you need to check the constructor
		
		//Note:
		//If you use "parent class" as a data type the variables and methods which are 
		//in child class ,WILL NOT be accessable
		
		//Note:
		//If you use "Child Class" as data type the variables and methods which are 
		//in parent class will be accesible 
		
		
		Animal obj1 = new Animal();
		System.out.println(obj1.age);
		obj1.eat();
		System.out.println(obj1.add());
		
		Animal obj2 = new Cat();
		System.out.println(obj2.age);//17 came from Animal
		System.out.println(obj2.name);//Joe came from Animal
		obj2.sound();//Cats meaw.came from Cat
		System.out.println(obj2.multiply());//63 came from Cat
		
		Cat obj3 = new Cat();
		System.out.println(obj3.age);//4
		System.out.println(obj3.height);//2
		obj3.eat();//Cats drink milk     ====>
		           //Animals eat   =====> because of super. in Cat Class
		System.out.println(obj3.add());//System.out.println(super.age); to the Animal Class======>	int age =17;
		                               //4====>System.out.println(this.age); in Cat Class====>	int age= 4;
		                               //12===>return 7+5;

		
		


	}

}
