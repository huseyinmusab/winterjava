package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class SwitchStatements03 {
	
	/*
	 * Ask user to enter one of the 'U','S', and 'A'
	 * Then type a program by using "switch statement" to print "United" for 'U'
	 * "States" for 'S',and "America" for 'A'
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a character");
		
		char ch = scan.next().charAt(0);
		
		switch(ch) {
		case 'U':
		case 'u':          //====> we can also add one more case to uppercase and lowercase
			System.out.println("United");
			break;
		case 'S':
		case 's':
			System.out.println("States");
			break;
		case 'A':
		case 'a':
			System.out.println("America");
			break;
			default:
				System.out.println("Enter a valid charachter");
			
		
			scan.close();
		}
		
		
		
	}

}
