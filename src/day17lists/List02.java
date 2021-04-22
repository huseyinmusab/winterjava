package day17lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List02 {

	public static void main(String[] args) {

			List<Integer> list1 = new ArrayList<>();
			
			list1.add(3);
			list1.add(5);
			list1.add(1);
			list1.add(9);
			list1.add(7);
			list1.add(15);
		
			System.out.println(list1);//[3, 5, 1, 9, 7, 15]

			Collections.sort(list1);
			
			System.out.println(list1);//[1, 3, 5, 7, 9, 15]
			
			List<Integer> list2 =new ArrayList<>();
			list2.add(7);
			list2.add(0);
			list2.add(34);
			list2.add(15);
			list2.add(78);
			list2.add(9);
			
			//Type a code to find the minimum and maximum element of the list2
			
			System.out.println(list2);//[7, 0, 34, 15, 78, 9]

			Collections.sort(list2);
			System.out.println(list2);//[0, 7, 9, 15, 34, 78]
			
			int minNum = list2.get(0);
			System.out.println(minNum);//0
			
			int maxNum = list2.get(list2.size()-1);
			System.out.println(maxNum);//78
			
			System.out.println(list2.remove(2));
            System.out.println(list2);//[0, 7, 15, 34, 78]
            
            
            //list2.remove(7);
            //System.out.println(list2);RTE
            //note: For integer list we can not use the remove() which accepts elements name as a parameter ,
            //because it assumes elements name as index



			
			
			
	}

}
