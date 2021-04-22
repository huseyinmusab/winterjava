package day03wrapperclassconcatenatelogicaloperators;

public class LogicalOperators01 {

	/*
	 Operators in Java
	 1) = is assignment operator
	 Puts the value from right and puts it into container
	 for example: int s = 12;
	 
	 Note: Followings are "Comparison Operators".return boolean every time
	 
	 
	 2) == is equal sign in Java
	 5 == 2+3 returns boolean	
	 if left part equals to right part ,it returns "true", otherwise it returns false
	 
	 3) != 	NOT EQUAL 
	 if left part does not equals to right part ,it returns "true", otherwise it returns false
	 
	 4) > GRETAER THAN returns boolean
	 5) < LESS THAN returns boolean
	 
	 6) >= GRETAER THAN or EQUAL TO
	 7) <= less than or EQUAL TO
	 
	 Note: Followings are logical operators ,return boolean every time
	 
	 
	 8)&& AND operator 
	  Returns true if both statements are true
	  
	 9) ||  OR operator 
	   Returns true if one of the statements is true (POLLYANNA)
	    
	 10) & AND operator
	 
	    & returns true if everything is true
	      
	    
	 

	 
	 
	 
	 */
	
	public static void main(String[] args) {
		
		System.out.println(5==2+3);
		
		System.out.println(5!= 2+4);//true
		
		System.out.println(5>3);
		
		System.out.println(5>=5);//ONE OF THE IS TRUE,SO ASSIGNMENT RETURNS TRUE
		
		System.out.println(5<=3);//FALSE
		
		System.out.println((5<7) && (3>1));//true, IF 2 PARTS OF THEM ARE TRUE,IT RETURNS TRUE
		System.out.println((5<7) && (3>1) && (4==5));//false
		
		System.out.println((15<7) || (3>10) || (4==5) || (11>4));//true
		
		//What is the difference between && and &?
		System.out.println((5>7) & (3>1) & (4==4));//
		
		

		
		
	}

}
