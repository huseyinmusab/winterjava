package day12dowhilesvariablesconstructors;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		printEvenCheck();
		
		//Ask user to enter an integer
	    //If the integer is even print on the console �You won!�
        //Otherwise ask user to enter another integer

	}
	
	public static void printEvenCheck() {
		
		Scanner scan = new Scanner(System.in);
		int a=0;

		
		do {
			System.out.println("Enter a number");
			a=scan.nextInt();

			
		}while(a%2!=0);
		System.out.println("You Won");
		scan.close();
	}

}
