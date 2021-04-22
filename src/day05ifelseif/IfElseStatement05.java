package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement05 {
	
	/*
	 * Type a java code by using if-else if() statement
	 * A school has following rules for grading system
	 * 1.Below 50 -D    2. 50 to 59 -C      3.60 to 80 -B       4. from 80 to 100 -	A
	 * Ask user to enter marks and print the corresponding grade
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter yout grade");
		
		int point = scan.nextInt();
		
		if(point<0) {
			
			System.out.println("Enter a valid point");
			
		}else if(point<50) {
			
			System.out.println("Your grade is D");
			
		}else if(point <=59) {
			
			System.out.println("Your grade is C");
			
		}else if(point <=79) {
			
			System.out.println("Your grade is B");
			
		}else if(point<=100) {
			
			System.out.println("Your grade is A");
		}else {
			System.out.println("Enter a valid point");
		}

		//THIS IS THE SHORTEST WAY ,IF WE USE && ,THAT MEANS WE CHECK THE SAME THINGS OVER AND OVER,IT IS NOT GOOD FOR JAVA
		
		
		
	}

}
