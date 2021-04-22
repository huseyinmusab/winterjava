package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class LeapYearInterviewQuestion {
	
	/*
	 * Ask user to enter if-else if() statement
	 * Write a program to check if a year is leap or not
	 * if the year is divisible by 100 then it must be divisible by 4000
	 * if a year is not divisible by 100 then it must be divisible by 4
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a year...");
		
		int year = scan.nextInt();
		
		if(year%100==0 && year%400==0) {
			
			System.out.println(year + "is a leap year");
			
		}else if(year%100!=0 && year%4==0) {
			
			System.out.println(year + "is a leap year");
			
		}else {
			System.out.println(year +"is not a leap year");
		}
		
		
		
		
	}

}
