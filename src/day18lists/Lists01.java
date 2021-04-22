package day18lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {

		//Working with lists is easier than working with arrays
		//Because of this sometimes we want to CONVERT ARRAYS TO LISTS
		
		
		//we can use asList() from Arrays class
		Integer arr[] = {3,5,7,1,5};
		List<Integer> list1 = Arrays.asList(arr);
		
	     System.out.println(list1);//[3, 5, 7, 1, 5]

	     
	     //Use some list methods:
	     list1.set(1,10);
	     System.out.println(list1);//[3, 10, 7, 1, 5]
	     
	     System.out.println(list1.subList(2, 4));//[7, 1] //like substring()
	     
	     //************
	     //When we use asList(), we can not use list method that are related to length.WHY? 
	     //Because at the beginning it is an Array and it has stabil length that can not changed like lists.
	     //list1.remove(0);
	     //System.out.println(list1); RTE
	     
	     //list1.add(5);
	     //System.out.println(list1);//rte
	     
	     //list1.clear

	     
	     //Instead of using asList() we can use for loop and take elements from
	     //array and add them to list
	     int brr[]= {7,5,3,9,0};
	     List<Integer>list2 = new ArrayList<>();// an empty list created
	     
	     for(int i =0; i<brr.length; i++) {
	    	 list2.add(brr[i]);
	    	 
	     }
	     System.out.println(list2);
	     list2.remove(2);
	     System.out.println(list2);
	     
	     
	     
	     
	     //removeIf():We will learn in lambda 
	     //It removes elements according the condition
	     //it returns boolean
	     System.out.println(list2.removeIf(t->t%2==0));//true
	     System.out.println(list2);
	     
	     
	     
	     
	     //How can we convert lists to array? NOT RECOMMENDED!!!!     
	     Object[] arrayFromList = list2.toArray();
	     System.out.println(Arrays.toString(arrayFromList));//[7, 5, 9, 0]
	     
	     /* How to convert an ArrayList to an Array
	      * List<String> list = new ArrayList<>();
             list.add("hawk");
            list.add(“robin”);
            System.out.println(list); // [hawk, robin]
            String arr[ ] = list.toArray(new String[0]);
            System.out.println(arr.length); // 2
            System.out.println(Arrays.toString(arr)); // [hawk, robin]
	      */

	     
	     
		
		
		
	}

}
