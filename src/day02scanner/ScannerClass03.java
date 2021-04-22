package day02scanner;

import java.util.Scanner;

public class ScannerClass03 {
	/*
	 Type a program which calculates the area and the perimeter of a rechtangle
	 whose length and width are entered by user.
	 Hint1: Area of a rechtangle  is  width*length
	 Hint2: Perimeter of a rechtangle  is 2*(width*length)
	 */
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the length of the rechtangle");
		System.out.println("Please enter the width of rechtangel");
		
		double length = scan.nextDouble();
	    double width = scan.nextDouble();
	    
	    System.out.println("Area of the rechtangle "+ length*width);
	    System.out.println("Perimeter of the rechtangle  "+2*(length+width));

		
		
   		
		
	}

}
