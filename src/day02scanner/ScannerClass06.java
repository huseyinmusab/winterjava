package day02scanner;

import java.util.Scanner;

public class ScannerClass06 {
	/*
	  Ask user to enter his/her full name
	  Then ask user to enter his/her spouse's name
	  Then ask user to enter his/her address
	  Then print them all on the console
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your full name ");
		String fullName =scan.nextLine();
		
		System.out.println("Please enter your spouse's first name");
		String spousesFirstName = scan.next();
		
		scan.nextLine();//After using nextLine(), if you use any other method,type "scan.nextLine();" once

		System.out.println("Please enter your address");
		String address = scan.nextLine();
		
		System.out.println("Your full name : "+fullName);
		System.out.println("Your spouse's first name:"+spousesFirstName);
		System.out.println("Your address : "+ address);

		


		
		
		

	}

}
