package lambda2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class WarmUp {
	
	/*
	 * int arr[][] = { {-4, -3, -2, -1, 0 ,1, 2}, {-3, -2, -1, 0, 1, 2, 3}, {-1, 0, 1, 2, 3, 4} };
	   Create a method to store all negative elements in a list then print the list on the console.
	 */
	
	
	public static void main(String[] args) {

		int arr[][] = { {-4, -3, -2, -1, 0 ,1, 2}, {-3, -2, -1, 0, 1, 2, 3}, {-1, 0, 1, 2, 3, 4} };
		
		System.out.println(getNegativesStructuredElements(arr));//[-4, -3, -2, -1, -3, -2, -1, -1]

		System.out.println(getNegativesFunctional(arr));
		

		
	}
	//Structure Programming
	public static List<Integer> getNegativesStructuredElements(int arr[][]) {
		
		
		List<Integer>negElList=new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				
				
				if (arr[i][k]<0) {
					negElList.add(arr[i][k]);
				}else {
					break;///doesnt check positive ones , it makes faster
				}
				
			}
			
		}
		
		return negElList;
	}
	
	//Functional Programming
	public static List<Integer> getNegativesFunctional(int arr [][]) {
		
		List<Integer>negElList= new ArrayList<>();
		
		//Normally functional for only collections,but after java 8 we can use functional for arrays too.
		Arrays.stream(arr).flatMapToInt(t->Arrays.stream(t)).filter(t->t<0).forEach(t->negElList.add(t));
		
		//Arrays.stream(arr).flatMapToInt(t->Arrays.stream(t)).filter(t->t<0).forEach(t->negElList.add(t));
        return negElList;
		
	}
}
