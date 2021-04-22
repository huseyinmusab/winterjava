package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement06 {
	
	/*
	 * Ask user to annual salary , if the salary is more than equal to 80.000$
	 * output will be "I accept the offer", if the salary is between 60.000$ and 80.000$
	 * output will be "I negotiate to increase ",
	 * otherwise output will be "I do not accept the salary"
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the salary");
		
		int salary = scan.nextInt();
		
		if(salary<0) {
			System.out.println("Are you kidding me?");
			
		}else if(salary<60000) {

			System.out.println("I do not accept the salary");
			
		}else if(salary <= 80000) {
			
			System.out.println("I negotiate to increase");
			
		}else {
			System.out.println("I accept the offer");
			
		}
		scan.close();
		
		
		
	}

}
