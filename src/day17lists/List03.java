package day17lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List03 {

	public static void main(String[] args) {

		
		
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("K");
		list1.add("N");
		list1.add("Y");
		list1.add("W");
		
		List<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("K");
		list2.add("N");
		list2.add("Y");
		list2.add("W");
		
		//hOW TO CHECK IF 2 LISTS ARE EQUAL OR NOT
		//equals() returns boolean
		System.out.println(list1.equals(list2));//true
		
		
		//How to check if a list has a specific element
		System.out.println(list1.contains("Y"));//true
		System.out.println(list1.contains("X"));//false
		
		List<String>list3 =new ArrayList<>();
		list3.add("A");
		list3.add("K");
		list3.add("X");

		System.out.println(list1.contains(list3));
		
		
		
		
		
		
		//************************************************************************************************
		//Ask user to enter as letter
		//If the letter exists in list1 convert it to "Got it"
        //otherwise add the element which user entered into the list1
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a letter please");
		String str =scan.next().toUpperCase().substring(0, 1);///i can not use charAt() because it is string list,thats why i need substring()
		
		if(list1.contains(str)) {
			
			list1.set(list1.indexOf(str), "Got it");
			System.out.println(list1);
			
		}else {
			
			list1.add(str);
			System.out.println(list1);
		}
		
		scan.close();
		

		
		
		
		
		
		
		
		
	}

}
