package day31interfacecollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {
	/*
	 * By using loops we can not update collections but by using Iterator or listIterator we can.
	 * 2) listIterator is more functional than Iterator
	 * 3) listIterator or iterator is interfaces
	 * 4)Inside the iterator we have hasNext(), next(),remove(), and forExchRemaining() methods
	 */

	public static void main(String[] args) {
		
		//TO UPDATE COLLECTIONS WE USE ITERATORS
		//By using List.of() you can create and add methods shortly
		//List<String>list1= List.of("A","C","B");
		
		List<String>list1=new ArrayList<>();
		list1.add("A");
		list1.add("C");
		list1.add("B");
		
		System.out.println(list1);
		
		for (String w : list1) {
			w=w+"X";
			
		}
		System.out.println(list1);//[A, C, B] by using for each loop i can not update my list as we see

		Iterator<String>it1=list1.iterator();
		
		while(it1.hasNext()) {
			
			it1.next();
			
			it1.remove();
		}
		System.out.println(list1);//[] ITERATOR is for updating list
		
		
	}

}
