package day14constructorsstatickeywordsarrays;

import java.util.Arrays;

public class Arrays01 {
	
	
	/*
	 * 1) To store MULTIPLE values,we need Arrays
	 * 2) An Array can  have just a SINGLE data type 
	 * if you decide to store integers into an array, you can store just integers,not the others
	 * 3)Arrays accept just PRIMITIVE data types as elements.When you put String in an Array Java stores 
	 * their references inside the Array,not the String itself
	 * 
	 * 
	 */

	public static void main(String[] args) {

		/*
		 * How to create an Array
		 * 1) Decide which data type will you store
		 * 2) Put a name for the Array
		 * 3)After the name put []
		 * 4) Use "new keyword" why? arrays are OBJECT already, we need "new" to create
		 * 5) Put the data types again with brackets ===>[]
		 */
		
		int array1[] = new int[5];
		//First way to create and assign values 
		array1[1] = 11; //[0, 11, 0, 0, 0]
		array1[4] = 22; //[0, 11, 0, 0, 22]
		array1[0] = -2;
		array1[3] = 33;
		array1[2] = 27;
       System.out.println(Arrays.toString(array1)); //  by using class name "Array " you can access to array , that means you have static methods
		
		//second way to create and assign values
       String array2[] = { "Ali",  "Can" , "Kemal", "Mary"};
       System.out.println(Arrays.toString(array2));
       
       //How to update an element
       array2[1]="Canan";
       System.out.println(Arrays.toString(array2));
       
       //How to add elements more than size
       // if you try to add elemets more than the size of the array, you will get run time error
       //array2[4] ="Angie";
       //System.out.println(Arrays.toString(array2));
       
       
       
       
       //Update ALL ELEMENTS to "Joe"
       // In Strings length method is used with parenthesis like length()
       
       for(int i =0; i<array2.length; i++) {
    	   array2[i]= "Joe";
       }
       
       System.out.println(Arrays.toString(array2));
       
       
       //How to print array1 elements ONE BY ONE on the console in different lines
       int k =0;
       while(k<array1.length) {
    	   System.out.println(array1[k]);
    	   k++;
       }
       
       System.out.println();
       
       
       //How to find the SUM of all array1 elements
       int m =0;
       int sum =0;
       do {
    	   sum=sum+array1[m];
    	   m++;
    	   
       }while(m<array1.length);
       System.out.println("The sum of element is "+ sum);
       
       
       //Replace "*" for all the character 'J' in array2 
       
       for(int i =0; i<array2.length; i++) {
    	   array2[i].replace("J", "*");
 	   
       }
       System.out.println(Arrays.toString(array2));
       
       

         


       
       
		
	}

}
