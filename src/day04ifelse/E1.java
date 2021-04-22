package day04ifelse;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give me an integer");
		
		int num = scan.nextInt();
		
		if(num>=1 && num<=5) {
			System.out.println("Weekday");
			
		}if(num>=6 && num<=7) {
			System.out.println("Weekend");
		}
	}

}
