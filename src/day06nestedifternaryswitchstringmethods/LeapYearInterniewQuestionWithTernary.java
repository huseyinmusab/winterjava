package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class LeapYearInterniewQuestionWithTernary {
	
	
	/*
	 * Type java code by using nested Ternary
	 * Write a program to check if a year is leap or not
	 * if the year is divisible by 100 then it must be divisible by 400
	 * if a year is not divisible by 100 then it must be divisible by 4
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a year...");
		int year = scan.nextInt();
		
		String result =(year%100==0) ? (year%400==0 ? "leap year":"not leap year")     : (year%4==0 ? "leap year" : "not leap year"); 
		System.out.println(result);
		scan.close();
	}

}
