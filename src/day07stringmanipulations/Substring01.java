package day07stringmanipulations;

import java.util.Scanner;

public class Substring01 {

	public static void main(String[] args) {

		/*
		 * A part of a String is called Substring
		 * substring() of String class is used for getting a substring from a String
		 * We use substring() to get a part of a String by using indexes
		 */
		
		String s1 = "Java is Java";
		System.out.println(s1.substring(5));//is Java ==>indexi say index is inclusive
        System.out.println(s1.substring(7));// Java   ==> bosluk var basinda
        System.out.println(s1);
        System.out.println(s1.substring(0));//Java is Java 

        //System.out.println(s1.substring(0));  =  System.out.println(s1);*******************************************
        
        //How can i get the LAST CHARACTER
        System.out.println(s1.substring(s1.length()-1)); //a  *******************************************************
        
        
        System.out.println(s1.substring(11));//a
        //System.out.println(s1.substring(12));//NOTHING                                   ****************************
        //System.out.println(s1.substring(13));//ERROR    StringIndexOutOfBoundsException  ****************************
        
        
        /*
         * wE HAVE 2 TYPE OF ERROR MESSAGES
         * 1) While we type our codes we get "red underline" this is called "Compile Time Error"
         * 2)While we type our codes we dont get any red underline but after running our codes we get red messages on the console , it is "Run Time Error"
         *      
         */
        
        
        
        
        String s2 = "Java is OOP language";
        System.out.println(s2.substring(0, 3));//Jav

        System.out.println(s2.substring(0, 14));//Java is OOP la  ===> first one is INCLUSIVE last one is EXCLUSIVE*****
        
        
        //How can i get  JUST i ? *****************************************************************************************8
        System.out.println(s2.substring(5, 6));//i                                       

        
        
        
        /*
        Ask user to enter a String    IMPORTANT QUESTION
        If the first and the last character of the String are same
        print "Wooow!" otherwise, print "Hmmmm!" on the console
        */
        
        Scanner scan = new Scanner(System.in);
        String str5 = scan.nextLine();
        
        String first =str5.substring(0, 1);
        
        String last = str5.substring(str5.length()-1);
        
        if(first.equals(last)) {
        	
        	System.out.println("Wooow!");
        	
        }else {
        	System.out.println("Hmmmm!");
        }
        
        
        
        
        
		
		
		scan.close();
		
		
	}
	

}
