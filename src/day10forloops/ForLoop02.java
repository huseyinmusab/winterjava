package day10forloops;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		CheckPalindrome();

		
		
		
	}
	     //INTERVIEW QUESTION************************************************************************** RESIMLERE BAK 
         //1)Ask user to enter a String
	     //2)Check the String if it is �Palindrome� or not
	     //fOR EXAMPLE : aba and aba
	
	public static void CheckPalindrome() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to see if it is palindrome or not");
		
		String str = scan.nextLine();
		
		String revStr = "";
		
		for(int i=str.length()-1;    i>=0;   i--) {
			revStr = revStr +str.substring(i, i+1);
			
         }if(str.equalsIgnoreCase(revStr)) {
        	 System.out.println(str + " is palindrome");
         }else {
        	 System.out.println(str+ " is not palindrome");
         }
		
         scan.close();
	}
	
}
