package day02scanner;

import java.util.Scanner;

public class ScannerClass05 {
	
	//Type the program which asks user to enter his/her first name and last name,
	//then print it on the table

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your first name and last name");
		
		//If you wanna get a String data from user,use nextLine() method
		//nextLine() method gets full String which user entered
		
		String fullName = scan.nextLine();
		System.out.println("Your full name is "+fullName);
		
		System.out.println("Enter your kids first name");
		String kidsFirstName = scan.next();
		//If you want to  get a String data from user,use next() method as well
		//But next() method is used to get just the first word.
		//For example user entered "Ali Can"==> nextLine() returns "Ali Can"
		//                                    ==>next() returns "Ali"
 		
		System.out.println("Kid first name is "+ kidsFirstName);
		
		

		
		
	}

}
