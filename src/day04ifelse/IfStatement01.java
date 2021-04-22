package day04ifelse;

import java.util.Scanner;

public class IfStatement01 {
	
	/*
	 * ask user to enter an integer,
	 * if integer id even output will be "The integer is even"
	 * If integer is odd output will be "The integer is odd"
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter an integer to check if it is even or odd");
		int num = scan.nextInt();
		
		if(num%2==0) {
			System.out.println("Even");
		
		}
		if(num%2!=0) {
			System.out.println("Odd");
			
		}
		scan.close();
		
		
		

		
		
	}

}
