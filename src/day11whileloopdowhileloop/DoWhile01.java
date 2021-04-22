package day11whileloopdowhileloop;

public class DoWhile01 {

	public static void main(String[] args) {
		//while loop: condition is checked first,then if it is true loop body runs,if it is false loop body breaks
		//in while loop it is possible to make the body NOT to run
  
		int i=1;
		while(i>1) {
			System.out.println("This is while loop");
			i--;
		}
		//do while loop: in the do while loop loop body runs at least once
		//because it checks the condition at the end
		do {
			System.out.println("This is do while loop");
			i--;
		}while(i>1);
		
		
	}

}
