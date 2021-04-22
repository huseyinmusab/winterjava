package day30interfaces;

public class Notes {

	/*
	 * By using interface we can use multiple inheritance in java 
	 * Interface is not a class, INTERFACE IS INTERFACE
	 * 
	 * For concrete and abstract classes we use "extends" keyword, but interfaces we use "implements" keyword
	 * 
	 * Child:   Parents:
	 * Class===> Class           use "extends"
	 * Class===> Interface       use "implements"
	 * Interface ==>Interface    use "extends"
	 * Interface ===> Class      this relationship is not allowed
	 * 
	 * 
	 * We can not create an object from an interface,Interfaces are full abstract(ABSTRACT OGLU ABSTRACT)
	 * SO WE CAN NOT CRETAE OBJECT FROM INTERFACES
	 * We can  NOT have a CONSTRUCTORS in INTERFACES
	 * Methods should be  ABSTRACT in INTERFACE
	 * 
	 * 
	 * ABOUT METHODS:
	   All the methods in interface are public,abstract by default even if we do not write abstract 
	 * (When you work in a class if you remove access modifier , it is default but if you are working in an interface 
	 * if you do not write an access modifier it is public)************************
	 * 
	 * 
	 * ABOUT VARIABLES::
	 * All variable in an interface are:
	 * public static final by default
	 * Since variables are final we have to initialize them.
	 * 
	 * 
	 * 
	 * 
	 *  !!!INTERVIEW QUESTION!!!
    Differences between abstract classes and interfaces:
    
    1)Abstract Class = We can use "abstract" and "concrete" methods 
      Interface = We can use just "abstract" methods (After Java 8, we are able to use concrete methods interfaces (you ll learn them)
     
    2)Abstract Class= We cannot have multiple inheritance
      Interface     = We can have multiple inheritance
      
    3)Abstract Class = We can have constructors
      Interface = We cannot have constructors
      
    4)Abstract Class = We can have any type of variable 
     Interface = All the variables are public, static, final
     
    5)Abstract Class=When we create an abstract method we have to write "abtract" keyword
      Interface = No need to write "abstract" keyword to create abstract methods.
      
      We cannot create an object from but abstract classes and interfaces.
    
	 */
	
}
