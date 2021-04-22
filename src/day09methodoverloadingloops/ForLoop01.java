package day09methodoverloadingloops;

public class ForLoop01 {

	public static void main(String[] args) {

		printHello();
		printInt();
		printDesc();
		

	}
	
	
	/*
	 * Type code to print "Hello World!" 5 times on the console
	 */

	public static void printHello() {
		
	for(   int i=1; i<=5; i++  ) {
		
		System.out.print("Hello World!");
		
        }

	}
	
	/*
	 * Type code to print integers from 5 to 12 on the console
	 * 
	 */
	public static void printInt() {
		
		for(int i=5; i<8 ; i++  ) {
			
			System.out.print(i + " ");
			
		}
		
	}
	
	/*
	 * 	Type code to print integrs 12 to 5
	 */
	
	public static void printDesc() {
		
		for(int i=12;  i>=5; i--) {
			System.out.print (i + " ");
		}
		
		
		
	}
	
    
}
