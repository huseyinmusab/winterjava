package day10forloops;

import java.util.Scanner;
/*
 * Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int s =scan.nextInt(); //spaces
		
		
		
			//to run the inner codes for every row
		for(int j=1;   j<=s;   j++) {
		
			//to draw spaces
		for(int i=s-j;   i>0;  i--) {
			System.out.print(" ");	//do not use println because we want it on the same line
		}
		    //to draw "* "
		for(int k=1;  k<=j;    k++) {
			System.out.print("* "); //do not use println because we want it on the same line
			
		}
		    //to move pointer to next line
		    System.out.println();
	  }	
		scan.close();
 */

public class forLoop05 {
	

	public static void main(String[] args) {
		drawTriangle();
		
     }
/*
 * 
 *    INTERVIEW QUESTION
	 1)Ask user to enter a positive integer
	 2)Create and print the following image on the console
						       *
						      * *
						     * * *
						    * * * *
						       .
						       .
						       .
    */
	
	public static void drawTriangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int s =scan.nextInt(); //spaces
		
		
		//to run the inner codes for every row
				for(int j=1;   j<=s;   j++) {
				
					//to draw spaces
				for(int i=s-j;   i>0;  i--) {
					System.out.print(" ");	//do not use println because we want it on the same line
				}
				    //to draw "* "
				for(int k=1;  k<=j;    k++) {
					System.out.print("* "); //do not use println because we want it on the same line
					
				}
				    //to move pointer to next line
				    System.out.println();
			  }	
				scan.close();
			
		
	
		
		
		
		
	}
	
}