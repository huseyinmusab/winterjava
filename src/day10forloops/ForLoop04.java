package day10forloops;

import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {

		 productInt();
		
		
	}

	/*INTERVIEW QUESTION***********************************************************************************
	 * 
	 * Ask user to enter begining and ending values
	 * Type code to calculate the multiplication of the integers from the beginning to ending values
	 * that question can be asked like
	 * type code to calculate the factorial of given number
	 */
	
	public static void productInt() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the starting integer value");
		
		int s = scan.nextInt();
		
		System.out.println("Enter the ending value");
		int e =scan.nextInt();
		
		int product=1;
		
		
		for(int i=s;  i<=e;   i++ ) {
			product=product *i;
			
		}
		System.out.println(product);

		scan.close();
		
		
		
	}
}
