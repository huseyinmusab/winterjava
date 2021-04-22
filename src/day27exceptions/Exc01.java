package day27exceptions;

public class Exc01 {

	public static void main(String[] args) {

		String s1 = "";
		System.out.println(s1.length());// integer 0
		
		String s2 =null;
		//System.out.println(s2.length());//NullPointerException:
		                                //if you try to do appropriate actions with a "null" you will get NullPointerException
		//NullPointerException is a RunTimeException
		
		int arr[]= {2,5,1,9};
		//System.out.println(arr[4]); //ArrayIndexOutOfBoundsException: For non-existing indexes in arrays
		                           // you will get ArrayIndexOutOfBoundsException, which is a Run Time Exception
		
		Object i=70;
		//String s =(String)i;//ClassCastException: If a data type can not be cast to another data type you will get this
		                    //ClassCastException is a Run Time Exception
		
		int a=Integer.parseInt("123");
		System.out.println(a+2);
		int b=Integer.parseInt("abc");
		System.out.println(b+2);         //NumberFormatException:
		                                 //If you want to convert non-digit Strings to Integer you will get NumberFormatException
		                                 // which is Run Time Exception
		
		
		
		
		
		
		
		
	}

}
