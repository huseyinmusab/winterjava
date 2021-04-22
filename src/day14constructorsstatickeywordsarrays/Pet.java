package day14constructorsstatickeywordsarrays;

public class Pet {

	public static void main(String[] args) {
     Dog.eat(); // to access a static method just class name is enough
     
     
     Dog dog = new Dog();
     
     dog.drink();// to access NON STATIC methods you MUST create OBJECT====> WE ACCESSED TO DRINK() BY CREATING Dog Object,Because drink() is NON STATIC method
     
     dog.eat(); //to access static methods , you can use objects AS WELL but it is not recommended =====> AS WE SEE THERE IS NOTIFICATION HERE,BECAUSE eat() is STATIC
     // and java gives you notification with yellow underline
     
	}

}
