package day27exceptions;

import java.util.Scanner;

public class Exc04 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter yyour age to see on the console");
		int age=scan.nextInt();
		System.out.println(getAge(age));
		scan.close();
		
	}
	
	public static int getAge(int age) {
		try {
			if (age<0) {
			throw new  IllegalArgumentException();//How to throw explicit exception //I blocked my application here==> when a hacker attaks your app, you can block your app by this way
			//When we type a code if we need to throw exception in anywhere ,and any times you can throw
			
			//Use "throw" keyword, then "new " keyword and the "constructor"
			}
		} catch (IllegalArgumentException e) {

			System.out.println("Negative values can not be used in ages");
		}
		
		
		return age;
		
	}

}
