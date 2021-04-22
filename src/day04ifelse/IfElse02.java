package day04ifelse;

import java.util.Scanner;

public class IfElse02 {

         /*
         Ask user to enter a character
         then check whether the character is alphabet or not
         */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter a character");
		  
		char character = scan.next().toLowerCase().charAt(0);
		
		if( character >='a' && character <='z' ) {
			System.out.println("The character is in the alphabet");
			
		}else {
			System.out.println("The character is not in Alphabet");
		}
		

		
		scan.close();
		
	}

}
