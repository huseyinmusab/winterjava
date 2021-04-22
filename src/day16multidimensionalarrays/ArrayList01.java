 package day16multidimensionalarrays;

import java.util.ArrayList;

public class ArrayList01 {
	/*
	 * 1)ArrayLists are flexible in size 
	 * 2)ArrayLists can not store by multiple data types
	 * 3)ArrayLists store non primitive data types
	 * 4)ArrayLists are updated version of Arrays
	 * 
	 * 
	 * 
	 *      DIFFERENT TYPE OF LIST NAMES(DO NOT CONFUSE:))
	 * ***ArrayList<String> list1 = new ArrayList<String>();
	 * 
       ***ArrayList<String> list2 = new ArrayList<>();
       
       ***List<String> list3 = new ArrayList<>();
       
       ***ArrayList<String> list4 = new List<>(); // DOES NOT COMPILE, RIGHT SIDE MUST BE ArrayList
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		
		//To print an Array list , using just its name in System.out.println(); is enough
		System.out.println(list1);
		
		//How to add elements into an ArrayList
		
		list1.add(21);
		list1.add(12);		
		list1.add(33);
		
		//How to add an element into a specific index
		list1.add(1,45); // it is a kind of overloading
		
		
		
		System.out.println(list1);//[12, 21] works with insertion order
		
		
	}

}
