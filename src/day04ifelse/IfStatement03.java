package day04ifelse;

import java.util.Scanner;

public class IfStatement03 {
	
	 /*
    Type java code by using if statement
    When you enter the name of the day a week, 
    output will be "Weekday" or "Weekend day" according to the name of the day
    Get the name of the name from user
    */

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the name of the day a week");
			String dayName= scan.next().toLowerCase();
			
			//TO COMPARE STRINGS DO NOT USE "==" SIGN. WE USE IT FOR COMPARE PRIMITIVES
			// USE equals() to compare Strings
			//how do I use equals?  "Ali.equals("")"
			
			
			if(dayName.equals("monday") ||dayName.equals("tuesday")||dayName.equals("wednesday")||dayName.equals("thursday")||
					dayName.equals("friday")) {
				
				System.out.println("Weekday");		
			}
			if(dayName.equals("saturday")||dayName.equals("sunday")) {
				System.out.println("Weekend");
				
			}
			if(!dayName.equals("monday") &&!dayName.equals("tuesday")&&!dayName.equals("wednesday")&& !dayName.equals("friday")
					&&!dayName.equals("thursday")&&!dayName.equals("friday")&&!dayName.equals("saturdday")&& !dayName.equals("sunday")){
				System.out.println("Enter a valid name");
										
			}
	}
	

}
