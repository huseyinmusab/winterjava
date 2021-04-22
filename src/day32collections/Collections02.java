package day32collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collections02 {
	
	/*
 	Hashing Technique: It is a technique to create UNIQUE codes for every element in a collection
 	[ "A", "B", "A", "C" ]
*/

/*
 	1)Set Interface has 3 implementations a)HashSet    b)LinkedHashSet     c)TreeSet
 	                                       superfast                        slow(like family tree,neeed to order)
 	2)Set means "no duplication" 
 	3)Tree means sorted in "natural order" 
 	4)"natural order" means ascending order for numbers, alphabetical order for characters
*/

/*
 	HashSet:
 	1)HashSet does not put the elements in any order. It puts elements in random order.
 	2)HashSet does not contain repeated elements
 	3)"null" can be used in HashSet just once
*/

/*
 	LinkedHashSet:
 	1)LinkedHashSet puts the elements in "insertion order"
 	2)LinkedHashSet does not contain repeated elements
 	3)"null" can be used in LinkedHashSet just once
*/

/*
   TreeSet:
   1)TreeSet puts the elements in "natural order"
   2)TreeSet does not contain repeated elements
   3)"null" can be used in TreeSet just once 
   4)TreeSet is very slow because of that we do not prefer to use TreeSet even we need sorted collection
*/

	

	public static void main(String[] args) {
		
		//By selecting data type as object or by not declaring data type, you can store 
		//multiple data types in a Collection
		//<Object> without this it gives yellow lines,java doesnt like that style.at the same time we can use <Object> for different data types
		//but one type is always better like Integer,String
		
		
		HashSet<Object> hSet  = new HashSet<>();
		hSet.add("A");
		hSet.add(2);
		System.out.println(hSet.add('c'));//true
		//If you send same elements into a set, it does not give any error but it does not add repeatedly
        System.out.println(hSet.add('c'));//false ,why? becaause this is the second time to try to add
		
		hSet.add(null);//adds null
		hSet.add(null);//does not add second null, because it exists
		
		System.out.println(hSet);//[null, A, 2, c]

		
		//LinkedHashSet
		LinkedHashSet<Integer> lhSet = new LinkedHashSet<>();
		lhSet.add(31);
		lhSet.add(6);
		lhSet.add(22);
		lhSet.add(null);
		
		System.out.println(lhSet);//[31, 6, 22, null]

		
		//TreeSet
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(12);
		tSet.add(-12);
		tSet.add(32);
		tSet.add(0);
		System.out.println(tSet);//[-12, 0, 12, 32] no need to use Collesctions.sort etc. it is sorted aautomatically
		                         // for example for student id card or something
		
		
		
		
		
	}

}
