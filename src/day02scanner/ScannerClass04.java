package day02scanner;

import java.util.Scanner;

public class ScannerClass04 {
	/*
	  Type a program which calculates the volume  of a rechtangle
	 whose length and width and height are entered by user.
	 Hint1: Area of a rechtangle  is  width*length*height
	
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter length");
		double length = scan.nextDouble();
		
		System.out.println("Please enter the width");
		double width = scan.nextDouble();
		
		System.out.println("Please enter the height");
		double height = scan.nextDouble();
		
		System.out.println("Volume of the rechtangle "+ length*width*height);

		
		
	}

}
