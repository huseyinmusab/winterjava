package day22stringbuildersencapsulation;


public class Encapsulation02 {
	
	/*
	 1)We use encapsulation to HIDE DATA and method IMPLEMENTATIONS
	 
	 2)Encapsulated codes should have following characteristics:
	   a)Everyone should know how to access to encapsulated data 
	   b)It should be easy to use even the code is complicated
	 
	 3)How to make encapsulation : 
	 
	   a)Make the access modifier private
	   b)Create "getter" and "setter"
	     getters are used TO READ the data
	     setters are used TO UPDATE the data
	     
	 4)The advantages of encapsulation:
	   a)It gives us FLEXIBILITY, whenever we want we CAN JUST UPDATE the data with the help of SETTERS
	   b)REUSEABILITY we create getters and setters just once and use them again and again
	   
	 5)After creating private variables if you don't create any setter methods, it will be updated in the class. 
	 Because of that the class is called immutable class
	   
	   If you want no one to read your data then don't create getter methods
	   If you want no one to update your data then don't create setter methods
	 */

	public static void main(String[] args) {

		
		Encapsulation01 obj = new Encapsulation01();
		
		
		System.out.println(obj.getAge());  //first we read here 23 by get
		
		System.out.println(obj.getCollegName().equals("Rutgers"));
		
		System.out.println(obj.getSsn());
		
		obj.setAge(67);  //we updated here to 67 by set
		System.out.println(obj.getAge());//and we wrote here the updated result by get 
		
		
	}

}
