package day04ifelse;

import java.util.Scanner;

public class IfStatement02 {
	/*
    Type java code by using if statement
    When you enter the initial of the day of a week, output should be all possible names of  the days
    For example; if the initial is 'S' output should be "Saturday and Sunday"
    Get the initial from user
    M,T,W,T,F,S,S
   */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the initial of any day");
	
		char initial=scan.next().toUpperCase().charAt(0);

		if(initial =='M') {
			
			System.out.println("Monday");
		}
		if(initial=='T') {
			System.out.println("Tuesday or Friday");
		}
		if(initial=='W') {
			System.out.println("Wednesday");
			
		}
		if(initial=='F') {
			System.out.println("Friday");
		}
		if(initial=='S') {
			System.out.println("Saturday or Sunday");
		}
		if(initial!='M'&& initial!='T'&&initial!='W' && initial!='F'&& initial!='S') {
			System.out.println("What are you doing");
			
		}
		scan.close();
		
	}

}
