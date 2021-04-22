package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists02 {		
	//******************************************************************************************************
	//Create a method to delete odd elements and increase the even elements by multiplying 5


	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(5);
		list.add(9);
		list.add(6);
		list.add(4);		
		System.out.println(list);//[8, 5, 9, 6, 4]
		updateList(list);
		
	}
	public static void updateList(List<Integer> list) {
		
		for (int i = 0; i<list.size(); i++) {
			
			if(list.get(i)%2!=0) {
				list.remove(i);
				i--;   //after remove it increases the index,means one step come back.when i=1 is,it decreases to 0 here,and then it is increasing to 1 by using i++ in loop condition
			}else{
				list.set(i,list.get(i)*5);
			}

		}
		System.out.println(list);

		        //[8, 5, 9, 6, 4]
				//[40, 5, 9, 6, 4]
				//[40, 9, 6, 4]
				//[40, 9, 30, 4]
				//[40, 9, 30, 20]   ===> if i dont write i-- here,the loop should be like that, and index order can be changed ,
		        //                       for example: after removing 5 ,9 has become as a first index
		
	}

}
