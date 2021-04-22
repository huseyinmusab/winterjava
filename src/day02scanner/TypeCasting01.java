package day02scanner;

public class TypeCasting01 {
        /*
		 *byte<short<int<long<float<double
		 *cast=behaving like someone else:)
		 *
		 */
	public static void main(String[] args) {
		
		//Auto Widening: If you assign a small data type to a large data type,type casting is done automatically by java.This is Auto Widening
		byte b1 =112;
		int i1 =b1;
		
		System.out.println(b1);
		System.out.println(i1);
		
		//Explicit Narrowing: If you assign a alarge data type to a small data type ,type casting can not be done by java automatically
		//You should take the responsibility and type the casting explicitly.
		//this is Explicit Narrowing
		
		int i2=120;
		short s1= (short)i2;
		
		System.out.println(i2);
		System.out.println(s1);
		
		//when you type "float f1=2.3f", it will complain
		//To fix that, you have 4 options
		//1
		float f1=2.3f;
		//2
		float f2=2.3F;
		//3
		float f3=(float)2.3;
		//4
		double f4=2.3;
		
		
		//If you use “Explicit Narrowing” with the numbers which are not in the interval
		//then you will get different results. The result will be calculated according to the 
		//modulus operation
		short s2=255;
		byte b4 =(byte)s2;
		System.out.println(s2);//255
		System.out.println(b4);//-1 
		
		int i3= 5;
		int i4 = 2;
		System.out.println(i3 / i4);// 	The result will be 2 because int/int for Java
		
		int i5=5;
		double d1=2;
		
		
		
		

	}

}
