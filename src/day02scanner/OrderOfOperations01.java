package day02scanner;

public class OrderOfOperations01 {
	/*
	 fOR MATHEMATICAL OPERATIONS WE HAVESOME RULES about order of operations 
	 1) Do exponential operations
	 2)do the operations inside the parenthesis
	 3)complete multiplication and division oerations
	 4)complete addition and subtraction operations
	 
	 */

	public static void main(String[] args) {
		
		int result1 =5 + 2 * (16 - 2 * 5);
		System.out.println(result1);

		int a =8+2*(24/3 -2*3)+1;
		int b= 4*3-3*(2+2*3);
		System.out.println(a+a*b);
		
		
		//What is the remainder when you divide 17by 3?
		//Modulus operator (%) is used to find reminder
		System.out.println(17%3);//2
		System.out.println(1235%11);//3
		//Modulus operator is used to find the digit of a number
		int c= 2345678;
		
		//What is the last digit of number c?
		System.out.println(c%10);
		
		
		
		
		
	}

}