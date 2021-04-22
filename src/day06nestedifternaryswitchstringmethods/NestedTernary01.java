package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class NestedTernary01 {
	
	/*
	 * Ask user to enter sn integer
	 * if the integer is not negative then check if it is less than 10,then return "The integer is digit"
	 * if the integer is  negative ,return "Negative can not be a digit
	 * use nested ternary
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		

		String result = a>=0 ? (a<10 ? "The integer is digit" : "The integer is not digit" ):("Negative can not be a digit");
		System.out.println(result);
		
		
	}

}
