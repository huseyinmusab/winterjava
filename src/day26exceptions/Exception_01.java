package day26exceptions;


public class Exception_01 {
	
	/*
	 * Exception is an anormal sitiation.In Java Exception is an event that disrupts the 
	 * normal flow of the program
	 * 
	 * 2 types of Exceptions:
	 * 1)Compile Time Exception(Checked Exception):Occur before click on the run button
	 *
	 * 2)Run Time Exceptions(Unchecked Exceptions):Occur after click on the run button
	 * 
	 * 
	 *  e.getMessage() : Every Exception class has their own messages
	 *  
	 *  In try-catch blocks if try block runs catch block does not run
	 * 
	 */

	public static void main(String[] args) {
		
		try {
			
			divide(6,3);
		    divide(3, 12);
		    divide(-3, 1);
		    divide(0, 7);
		    divide(8, 0);
		
		} catch (ArithmeticException e) {//instead of arithmetic we can also use Exception.it is parent of aritmetic
			
			//System.out.println(e.getMessage());//  / by zero
			e.printStackTrace();//detailed messages aboutException

			
			System.out.println("You can not divide by zero" + e.getMessage());//brief message about Exception
		}
		System.out.println("Can you print me?");
		

	}
	
	public static void divide(int a,int b) {
		
		System.out.println(a/b);
	}

}
