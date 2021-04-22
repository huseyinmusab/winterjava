package day10forloops;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		
		multiplicationTable();

		//Type a java code by using while loop
		//write a program that prompts the user to input a positive integer
		//it should then print the multipication table of that number
		//3*1=3 3*2=6 3*3=9............3*10=30
		
		
	}
	public static void multiplicationTable() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to see on the multiplication table");
		double d = scan.nextDouble();
		
		double i=1;
		while(i<=10) {
			
			System.out.println(d + " X " + i + "=" + (d*i));
			
			i++;
		}
		scan.close();
	}
}
