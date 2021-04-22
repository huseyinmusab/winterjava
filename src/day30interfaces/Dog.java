package day30interfaces;


public class Dog implements Animal, Mammals {

	@Override
	public void eat() {

		
		System.out.println("Dogs eat");
	}

	@Override
	public void sound() {

		System.out.println("Dogs bark");
	}

	@Override
	public void move() {

		System.out.println("Dogs run fast");
		
	}

	@Override
	public void givingBirth() {
		
		
	}
	
	
	
	

}
