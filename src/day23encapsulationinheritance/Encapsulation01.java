package day23encapsulationinheritance;

public class Encapsulation01 {
	
	private String name ="Ali Can";
	private int  age = 21;
	private boolean retired=false;
	private char initial='A';
	private String adress= "MiamiFlorida";
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	
	//void is used A)when you print sth on the console  
	//               B)when you do just an action 
	public void setName(String name) {
		this.name =name;
	}
	public void setAge(int age) {
		this.age=age;	
	}

	//For getters of boolean variables start the name of getter with "is"
	public boolean isRetired() {
		return retired;
	}

	public void setRetired(boolean retired) {
		this.retired = retired;
	}
	
	//public boolean getRetired() {
	//	return retired;
	//}
	//public void setRetired(boolean retired) {
	//	this.retired=retired; 
	//}
	
	
	
	//Make "initial" variable just readable====>you shouldnt create "setter" ,create just "getter"
	public char getInitial() {
		return initial;
	}

	
	
	//Make "adress" just updateable, you should not create getter, you should create setter
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	//If you want not to update any value What should you do?
	//Do not create any setter method.I fyou do not create any setter method , it means no value can be updated and the class is called 
	//IMMUTABLE CLASS
	
	/*
	 * How can you make a class IMMUTABLE?
	 * Make all variables private then do not create any setter method
	 * 
	 * SSN number or school id number for example we dont use setter method
	 * For school names we can not use setter nmethods for example
	 */
	
	
	
	
	
	
	
	

}
