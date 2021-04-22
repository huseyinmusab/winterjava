package day27exceptions;

import java.util.Scanner;

public class Exc02 {
	
	/*
	 * Get a String from user
 	   Convert it to an integer
 	   Return the integer after multiplying by 2
 	   Your code should not be blocked for any String
	 */
	
	

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);//you can also put this  into the method
		System.out.println("Please enter a Stringto convert t o integr");
		String str= scan.nextLine();
		
		System.out.println(convertStringToInt(str));
		scan.close();
		
	}
	
	public static int convertStringToInt(String str) {
		int a=0;
			
		try {
			
			a=Integer.parseInt(str);//str is converted to an integer here.but it gives exception.when i put this code into a try-catch,it doesnt compile anymore
			
			
		} catch (NumberFormatException e) {
			
			System.out.println(str+ "can not be converted to integer");
		}
		
		return 2*a;
				
	}

}
