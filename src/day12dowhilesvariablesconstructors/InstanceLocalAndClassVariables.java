package day12dowhilesvariablesconstructors;

public class InstanceLocalAndClassVariables {
	/*
	 * ===Instance(Object) Variables===
	  
	  1) if a variable is created
	  a)inside the class but outside of the main method and  methods
	  b)it is NOT "static"

	 then it is called "Instance(Object )Variable"
	 
	 2) if a variable is created
	  a)inside the class but outside of the main method and  methods
	  b)it is  "static"
	  
	 then it is called "Class Variable"
	 
	 NOTE:
	 The main difference between "static(class)" and "instance(object)" variables is that 
	     a)All updates on a static variable is visible by all objects which are created from the class but
	       all updates on an "instance variable" is visible just by the object
	     b)"static variables" are common for all objects, but instance variables are specified for an object
	     
	 3)If a variable is created inside the method , it is called "local variable"
	   Note: For local variables there is no default value
	         You have to assign value,when you create a local value
	   Note: "Local Variables" which are created in a "static method" are "static" automatically      
	       

	 */
	  
	 
	int i=12;   //Instance Variable
	int k;      //Instance variable (no need to assign ,it will assign by default)
	String str; // This is instance variable ,default value for str is ==>null
	boolean bl; // This is instance variable/ default value for boolean  is false
	char ch;     //This is instance variable,default valuefor char  is ''
	
	static byte by;//This is static variable,default value for by is 0

	public static void main(String[] args) {
		short sh =11;//This is "local variable"
		sh++;
		
		//int bl; 
		//bl++;==> this gives error why we dont assign the local variable int,local variable can not be default
		
 
	}
	
	
	
		
	}


