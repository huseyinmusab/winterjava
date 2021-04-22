package day05ifelseif;

import java.util.Scanner;


public class IfElseStatement01 {
	
	/*
	 * Ask user to enter an integer
	 * If the integer is even print even on the console
	 * if the integer is odd print odd on the console
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer");
		
		int a=scan.nextInt();
		
		if(a%2==0) {
			System.out.println("Even");
				
		}else {
			System.out.println("Odd");
			
		}

	}

}
