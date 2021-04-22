package day21accessmodifiersstringbuilder;

public class AccessModifiers02 {
	
	/*
	 To access class members from another class we have two ways:
	 a)We can use class name => it works ONLY for STATIC MEMBERS
	 b)We can create object => it works for NON-STATIC MEMBERS
	 
	1)In AccessModifiers01 class we created public, protected, default, private variables
	  In AccessModifiers02 we created an object to access them but we COULD NOT access to
	  PRIVATE ONES.
	  
	2)From DIFFERENT PACKAGES  you CAN NOT access DEFAULT members
	  That's why "default" and "package private" are synonyms.
	  
	3)From different packages we have two option to access protected members
	  If we are in CHILD class (SUB-CLASS) we can access them
	  If we are in NOT a child class we can NOT access them
	  
	4)For public class members we can access them from everywhere 
	Note:For classes, "private" and "protected" access modifiers cannot be used
	 */
	    
	    public static void main(String[] args) {
	        
	        AccessModifiers01 obj = new AccessModifiers01(); //AccessModifiers01 sinifini kullanarak object olusturma
	        
	        System.out.println(obj.defaultString);
	        System.out.println(obj.protectedString);
	        System.out.println(obj.publicString);
	        
	        obj.defaultMethod();
	        obj.protectedMethod();
	        obj.publicMethod();

	    }

}
