package day02scanner;

import java.util.Scanner;

public class ScannerClass02 {
	/*
	 Type a program which calculates the area and the perimeter of a square
	 whose side length is entered by user.
	 Hint1: Area of a square is length*length
	 Hint2: Perimeter of a square is 4*length
	 
	 
	 
	*/

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the length of the side of a square");
		
		double length = scan.nextDouble();
		
		System.out.println("area of a square "+ length*length);
		System.out.println("perimeter of a square"+ 4*length);
		
		
	}

}
