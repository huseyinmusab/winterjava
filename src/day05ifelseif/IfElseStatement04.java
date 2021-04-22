package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement04 {
	
	
	/*
	  Type java code by using if-else if() statement ,
	  if both of two integers are positive ,output will be sum of them.
	  If both of two integers are negative, output will be multiplication of them.
	  Otherwise output  will be "I can not add or multiply different signed numbers" 
	 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first integer,a");
		int a =scan.nextInt();
		System.out.println("Please enter the second integer,b");
		int b =scan.nextInt();
		
		
		
		if(a>0 && b>0) {
			System.out.println("The sum of "+ a + " and " + b + "  is " +(a+b) );
			
		}else if(a<0 && b<0) {
			System.out.println("The multiplication of "+a + " and " +b + " is " + (a*b));
			
		}else if(a==0 &&b==0){
			System.out.println("The sum and multiplication of "+a + " and " +b + " is " + (a+b));
			
		}else {
						System.out.println("I can not add or multiply different signed numbers");

		}


		
		
		
	}

}
