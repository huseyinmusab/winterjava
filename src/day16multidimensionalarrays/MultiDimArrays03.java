package day16multidimensionalarrays;

public class MultiDimArrays03 {

	public static void main(String[] args) {

		String arr[][] = { {"A","B"} ,{"K","e"} , { "L","X","e"} };
		
		//By using given multidimensional array,print "Bee" on the console
		//(we try to get the last characters)
		String s = "";
		
		for(int i=0; i<arr.length; i++) {
					
			s= s + arr[i][arr[i].length-1];
				
		}
		System.out.println(s);
		
		
		//HOMEWORK
		int brr[][]= {{32,12,11},{21,34},{3}};		
		//Find the multiplication the first elements in every array
		
		int prod =1;
		
		for(int i =0; i<brr.length; i++) {
			prod=prod*brr[i][0];
			
		}
		System.out.println(prod);
		
		
		
	}

}
