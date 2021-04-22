package day10forloops;

public class WhileLoop01 {

	public static void main(String[] args) {

		printOdd1(); 
		System.out.println();
		printOdd2();
		System.out.println();
		printDivBySixEight();
		System.out.println();
		printDivBySixEight2();
	}
	/*
	 * Type a program prints all odd integers from 4 to 25 on the console
	 * 1) use for loop
	 * 2) use while loop
	 */
	public static void printOdd1() {
		
		for (int i =4 ; i<26;  i++) {
			if(i%2!=0){
			   System.out.print(i +" ");
			}	        
	    }	
	}	
	//While Loop
	public static void printOdd2() {
		
			int i=4;
			while(i<26) {
				
				if(i%2!=0) {
					
					System.out.print(i + " ");
				}
				i++;
				
			}
	}
	// CREATE A METHOD TO PRINT INTEGERS WHICH ARE DIVISIBLE BY 6 AND 8 FROM 500 TO 25
	
	public static void printDivBySixEight() {
		
		
		
	   for(int i=500; i>=25; i-- ) {
		   if(i%6==0 && i%8==0 ){
			   System.out.print(i+ " ");
			   
		   }
		   
			
		}
		
	}
	
	public static void printDivBySixEight2() {
		
		int i=500;
		while(i>=25) {
			if(i%6==0 && i%8==0) {
				System.out.print(i+ " ");
			}
			i--;
		}
		
	}
	
}
