package day10forloops;

public class ForLoop03 {

	public static void main(String[] args) {
      
		sumOfAllInt();
		
		
		
	}
	
	
	
	/*
	 * Find the sum of all integers from 10 to 200  
	 */

	public static void sumOfAllInt() {
		
		int sum =0;
		
		for(int i=4;  i<7; i++) {
			sum = sum + i; // sum+=1; works as well
			
			//System.out.println(sum);
			// if you put it inside the for loop it display the sum of every loop one by one
			
		}
		//If you type System.out.println(sum); after the for Loop it will display the final value
        System.out.println(sum);
		
		
	}
}
