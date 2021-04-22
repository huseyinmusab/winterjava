package day02scanner;

public class IncrementDecrement01 {
		//Increment:

	public static void main(String[] args) {
		
		int num1 =5;
		System.out.println("Before Increment "+num1);//5

		// increase the value of num1 by 3
		//1.way
		num1=num1+3;
		System.out.println("After Increment "+num1);//8
		
		//2.way
		num1+=3;
		System.out.println("After Increment "+num1);//11
		
		//3.way This way can be used just to increase by 1
		num1++; // num1+=1 or num1=num1 + 1;
		System.out.println("After Increment "+ num1);//12
		
		//NOTE : Increment can be done by multiplication as well
		num1= num1*2;
		System.out.println("After multiplication increment "+num1);//24
		
		num1*=2;
		System.out.println("After multiplication increment "+num1);//48
		
		//3.way is not logic
		
		
	    //Decrease the number num1 by 2
		//1 way
		num1= num1-2;
		System.out.println("After deccrement "+num1);//46
		
		//2.way
		num1-=2;
		System.out.println("After deccrement "+num1);//44
		
		//3.way: This way can be used just to decrease by 1
		num1--;
	    num1--;
	    System.out.println("After deccrement "+num1);//42
	    
	    
	    //NOTE: Decrement can be done by division as well
	    num1= num1 /2;
	    System.out.println("After division decrement "+num1);//21
	    
	    num1 /=3;
	    System.out.println("After division decrement "+num1);//7
	    
		
		
		
		
		

		
		

	}

}
