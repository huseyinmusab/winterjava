package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class Ternary01 {
	
	/* type code by using if-else and ternary
	 * as user to enter an integer
	 * if the integer is even output will be integer is even
	 * if the integer is odd,the output will be "The integer is odd"
	 * 
	 */
	
	
	
	/*
	 * Ask user to enter 2 integers
	 * write a program to print the minimum one on the console
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		
		   //(Condition)         ( Question Mark)      (Code will be executed if the condition is true)      (Colon)       (Code will be executed if the condition is false)
		
		   
		   String result1 = a%2==0 ? "integer is even" : "integer is odd";
		   System.out.println(result1);

		   //2.task

		   System.out.println("Enter two integers");
		   int b = scan.nextInt();
		   int c = scan.nextInt();
		   
		   int result2 = b>c ? c : b;
		   System.out.println(result2);
		
		   scan.close();
		
		
	}

}
