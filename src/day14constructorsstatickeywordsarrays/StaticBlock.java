package day14constructorsstatickeywordsarrays;

public class StaticBlock {
	/*
	 * 1)static blocks are used to initialize "static (class) variables"
	 * 2) if you need some variables to initialize before constructors and main method are executed 
	 * you should initialize the variable by static block
	 * 3) if you have multiple static blocks, the static block at top works  first
	 */

	public static int age;
	
	static {
		System.out.println("Static block1 is executed");
		age=23;
	}
	static {
		System.out.println("Static block2 is executed");
		age=24;
	}
	
	public StaticBlock() {
		System.out.println("Constructor is executed");
		System.out.println(++age);
	}
	
	public static void main(String[] args) {
		System.out.println("Main method is executed 1");
		System.out.println(++age);

		StaticBlock obj = new StaticBlock();
		
		System.out.println("Main method is executed 2");
		

		
		
	}

}
