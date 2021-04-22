package day35maps;


public class WarmUp {

	/*
	 * WARMUP - 10 minutes
	 	1)Create a “package” and name it as “day35maps”
	 	2)Create a “class” and name it as “WarmUp”
	 	3)Create a method to print integers from 1 to 100 without using any integer
	 */
	public static void main(String[] args) {

		intWithoutInt();
	}
	
	public static void intWithoutInt() {
		//acoording to ascii table we are doing
		Character c1='e'-'e';
		Character c2='e';
		
		for(Character i=c1; i<c2; i++) {
			
			System.out.println((int)i);
		}
	}

}
