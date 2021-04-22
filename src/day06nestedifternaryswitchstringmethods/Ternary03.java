package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class Ternary03 {
	/*
	 * Ask user to enter an integer.If the number has 3 digits,output will be "This number has 3 digits"
	 * Otherwise, output will be "This number has no digits"
	 * How caan you decide the number of digits of an integer
	 */
	
	
	/*
	 * Ask user to enter a String
	 * If the String has 2 Characters,output will be
	 * "It is valid for state abbreviations" Otherwise,output will be "It id not valid for abbreviations"
	 */
	
	
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		
		String result = (a>99 && a<1000) || (a<-99 && a>-1000)  ? "This number has 3 digits" : "This number has no 3 digits" ;

		System.out.println(result);
		
		//2.Question
		
		System.out.println("Enter a String");
		String str = scan.next();
		
		String result1 = str.length()==2 ? "It is valid for state abbreviations" : "It is not valid for abbreviations";
		System.out.println(result1);
		
		scan.close();
		
		
		
		
		
		
	}

}
