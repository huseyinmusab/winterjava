package day18lists;

import day21accessmodifiersstringbuilder.AccessModifiers01;

public class AccessModifier03 extends AccessModifiers01{

	public static void main(String[] args) {

		
		AccessModifier03 obj=new AccessModifier03();
		
		
		System.out.println( obj.protectedString);
		
		System.out.println(obj.publicString);  
		
		obj.protectedMethod();
		obj.publicMethod();
		
		
		
	}

}
