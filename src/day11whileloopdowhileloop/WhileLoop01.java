package day11whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
	
	//Type java code by using while loop,
    //Write a program that prompts the user to input an integer.
    //It should then find sum of the digits of that number.
    //	123 ==> 1+2+3 = 6

	public static void main(String[] args) {
		
		addDigits();
		

	}

	public static void addDigits() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an integer");
		int num =scan.nextInt();
		
		int sum=0;
		
		if(num<0) {
			num=num*-1;
		}
		
		while(num!=0) {
			sum = sum+num%10;
			num/=10;
			
		}
		System.out.println("The sum of digits is: "+ sum);
		scan.close();
	}
}
