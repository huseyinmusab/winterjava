package day15arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {

		
		//int num []=new int[4];
		int num []= {5,1,2,8};
		System.out.println(Arrays.toString(num));//[5, 1, 2, 8]


		//<<<GENERAL CULTURE OF MAIN METHOD>>>
		
		//(String[] args) main method declared here an array and its size is empty
		//args[0]="Ali";
		//System.out.println(Arrays.toString(args));  CTE ===> here thats why we cant put something into array,it has already declared as empty by main main method
		//AND
		//why main method is static? If you dont make main method static, to access it you have to create object.To make it accessiblby all classes java made it static
		
		
		
		//How can we sort the elements
		//sort() sorts the elements in ascending order
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));//[1, 2, 5, 8]

		
		
		
		//*************INTERVIEW QUESTION***********
		
		//How can we sort num[] in descending order? TERS*************
		//to sort Arrays in descending order 
		//1)use sort
		//2)use loop to take elements one by one
		//int num[]= {9,5,1,8,7};

		Arrays.sort(num);
		System.out.println(Arrays.toString(num));//[1, 2, 5, 8]

		
		int revNum[]= new int[num.length];  //we made this DYNAMIC num.length <=> instead of 4
		
		
		int idx=0;
		for(int i=num.length-1; i>=0; i-- ) {
			
			revNum[idx]=num[i];
			
			 idx++;
		}
		System.out.println(Arrays.toString(revNum));//[8, 5, 2, 1]

		
		
		//OR 2.WAY LOOP 
		for(int i =0; i<num.length; i++) {
			revNum[i]=num[num.length-1-i];		
		}
		System.out.println(Arrays.toString(revNum));
		
		
		
		//How to check a SPECIFIC ELEMENT exists in an array?
		
		//1)sort the array element, it gives you index
		//2)use binarySearch()
		//we can use binarySearch () for all data types  
		//NOTE:If you use binarySearch() method without sorting elements, you will get a result but it will not be meaningful
		
		
		int num2[]= {2,7,1,13};
		
		Arrays.sort(num2); //{1,2,7,13}
		
		//to check if 3 exists in this array
		System.out.println(Arrays.binarySearch(num2,7));//2
		System.out.println(Arrays.binarySearch(num2, 13));//3
		
		//What if i look for non-existing element?
		//it will return negative number and the number will be the order
		System.out.println(Arrays.binarySearch(num2, 4));//-3 (imagine where would 4 be)
		System.out.println(Arrays.binarySearch(num2,22));//-5 

		//int num2[]= {3,8,12,8,7};

		//System.out.println(Arrays.binarySearch(num2,8));// doesnt run if there is repeated elements

		
		
		
		
	}

}
