package day12dowhilesvariablesconstructors;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		
		passwordCheck();

		//Ask user to enter password
		//If the password has more than 6 characters print "it is okay"
		//Otherwise, print "Make the password longer than 6 characters" and ask user to enter a new password
		
		
		
		
		
	}
	public static void passwordCheck() {
		Scanner scan = new Scanner(System.in);
		
		String password ="";
		
		do {
			System.out.println("Enter your password");
			password=scan.nextLine();
			if(password.length()>6) {
				System.out.println("It is ok");
			}else {
				System.out.println("Make the password longer than 6 characters");
			}
			
			
		}while(!(password.length()>6));
		
		scan.close();
	}

}
