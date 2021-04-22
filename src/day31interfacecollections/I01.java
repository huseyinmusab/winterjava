package day31interfacecollections;
/*
 * If it is not must, do not use same names for variables in parent interfaces
 * If you need to use same names for variables for parent interfaces, when you call variables
 * do not forget  to use interface names.Otherwise you will get CTE
 * 
 */

public interface I01 {
	
	int v1=2000;
	String name1="Audi";
}

interface I02 {
	
	int v1=3000;
	String name2="Honda";

}

class Car implements I01, I02{
 
	public static void main(String[] args) {
		System.out.println(name1);//Audi
		System.out.println(name2);//Honda
		System.out.println(I01.v1);//2000 if i mentioned it like that , there will be not confusion
		System.out.println(I02.v1);//3000
		
		
	}
}
