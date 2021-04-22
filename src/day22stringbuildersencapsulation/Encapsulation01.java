package day22stringbuildersencapsulation;

public class Encapsulation01 {
	
	
	private String collegName= "Colombia";
	private int age=23;
	private boolean old =true;
	private String ssn= "123456789";
	private String name ="Kübra";//getter
	
	
	
	
	public String getCollegName() {
		return collegName;
	}
	public int getAge() {
		return age;
	}
	public boolean isOld() {
		return old;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return "*****"+ssn.substring(5);
	}
	public void setCollegName(String collegName) {
		this.collegName = collegName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setOld(boolean old) {
		this.old = old;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	
	//Get Methods
	
	
	
	
	
	//Set methods
	
	

}
