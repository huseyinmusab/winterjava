package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class StringManipulation01 {
	/*
	 * String Methods:
	 * 1)toUpperCase  2)toLowerCase   3)charAt()  4equals()  5)equalsIgnoreCase()  6)lenght()
	 * 7)next()   8)nextLine()  9)indexOf()  10) lastIndexOf()  11)contains()
	 */

	public static void main(String[] args) {
		
		String str = "Java is easy if you study";
		
		//9) indexOf() returns the index of first occurence of the character
		System.out.println(str.indexOf("i"));//5

		//If the character doesnt exist in the String,it returns negative one (-1)
		System.out.println(str.indexOf("x"));//-1
		
		//indexOf() accepts char as well as a parameter
		System.out.println(str.indexOf('i'));//5
		
		//if you use multiple characters in indexOf(), it returns the index of first character
		System.out.println(str.indexOf("easy"));//8
		
		//if you use indexOf() with 2 parameters,Java looks for the character after the given index
		//Second parameter is inclusive
		System.out.println(str.indexOf('i', 8));//13   ===>8 den baslayip  i ye kadar say,i nin indexi cevaptir
		
		
		
		
		/* INTERVIEW QUESTION (IMPORTANT)***********************************************************************************
		 * Ask user to enter a String and character,if the String has the character
		 */
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter a String  the enter a character");
		
		//String s = scan.nextLine();
		//char ch =scan.next().charAt(0);
		
		//String result =s.indexOf(ch)==-1 ? "String has no character" : "String has the character" ;
		//System.out.println(result);
		
		//10)lastIndexOf()
		
		String t ="Java ah Java";
		
		System.out.println(t.lastIndexOf('a'));//11
		//lastIndexOf returns the index of last occurence of character 
		//lastIndexOf() char or String ,it accepts both
		System.out.println(t.lastIndexOf("a"));//11
		
		//If the character doesnt exist in the String,it returns negative one (-1)
		System.out.println(t.lastIndexOf("w"));//-1
		
		//lastIndexOf() returns the index of first character of last occurence of Java
        System.out.println(t.lastIndexOf("Java"));//8
        
        System.out.println(t.lastIndexOf("J", 5 ));//0
        System.out.println(t.lastIndexOf("v", 5 ));//2

        //If you use lastIndexOf() with 2 parameters ,get the character starting with the index and to the beginning of the String
        // In the following example we are using "Java a"
        System.out.println(t.lastIndexOf("h", 5 ));//-1
        
        
        
        
        //INTERVIEW QUESTION EBAY*************************************************************************************
        //Ask user to give you a String and a character
        //If the character does not exist in the String or exists JUST ONCE print "Not good!"
        //If the character is used multiple times to print "Wooowww!"
        
        // Scanner scan = new Scanner(System.in);
         //System.out.println("Enter a String  the enter a character");
      		
      	 //String s = scan.nextLine();
      	 //char ch =scan.next().charAt(0);

      	 //if(s.indexOf(ch)==-1 || s.indexOf(ch)==s.lastIndexOf(ch)) {
      	//	 System.out.println("not good");
      		 
      	 //}
      	 
      	 //if(s.indexOf(ch)!= s.lastIndexOf(ch)){
      		 
      	// System.out.println("Woow");
      	 //}
        
        //11)contains() is used to check if a single character or multiple characters exist in a String
        //contains() returns boolean
        String r= "Learn Java, earn money";
        
        System.out.println(r.contains("e"));//true
        System.out.println(r.contains("x"));//false
		
        //System.out.println(r.contains('x'));=====> contains() doesnt work with char
        
        System.out.println(r.contains("earn"));//true
        
        
        

		
		

		
		
		
		

		
		
		
	}

}
