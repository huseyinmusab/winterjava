package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement02 {
	/*
	 * Ask user to enter a character ,then check whether the character is alphabet or not
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");

		char character = scan.next().charAt(0);
		
		if((character>='a' && character<='z') ||(character>='A' && character<='Z') ) {
			
			System.out.println(character +" is in Alphabet");
			
		}else {
			System.out.println(character + " is not in Alphabet");
			 
		}
		
		
	}

}
