package day31interfacecollections;

public class Operations implements I03 {

	public static void main(String[] args) {

		//add() method is default method in I03 because of that I can not access
		//to add() method by using interface name but multiply() method is STATIC method we can 
	    //access to it just by using interface name
		
		
		
		I03.multiply(10, 20);
		
		//add() method is a DEFAULT method because of that I have to create an OBJECT to access to
		//add() method.
		I03 obj = new Operations();
		obj.add(23, 12);
		
		
		//Note: when we use classes ,accessing static methods is allowed by using objects,but
		//in interfaces ,when you create static methods you can access them just buy using interface names
		//Accessing by using by object is not allowed
		
		
		
		
		/* And by using this feature(static and default keywords) i created methods with body andddd we dont need to override them,WHY?
		 * Because they are not abstract methods ,they have body and we do not need to override them.As we know interface is very strict by Overriding
		 * This is update by oracle after java 8 .(Brief of this topic)
		 * 
		 *      public default int add(int a,int b) {// default is not access modifier here
		
		        return a+b;
	             }
	  
	            public static int multiply(int a,int b) {//public if you want 
		  
		         return a*b;
	            }
	
		 */
		
	}

}
