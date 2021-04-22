package day04ifelse;

import java.util.Scanner;

public class IfElse01 {
	
	/*
    Ask user to enter the values of length and width of a rectangle then check
    if it is square or not
    */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("give me the length ");
		double length =scan.nextDouble();

        System.out.println("give me the width");
        double width=scan.nextDouble();
		
		if(length<=0 || width<=0) {
			System.out.println("Width and Length have to be positive number");
			
		}else {
			if(length==width) {
			System.out.println("this is square");
		}else{
			if(length!=width) {
        	System.out.println("This is a Rechtangle");
		}
		
		 
		}
		}
	}
}
        	
        
		
		
		
	


