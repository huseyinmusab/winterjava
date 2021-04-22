package day30interfaces;

public interface Animal {
	
	 int NUM = 6;       //public static final int nUM; ===>when we see blue italic it is final******* IMPORTANT
	 int AGE =9;
	
	abstract  void eat();
	abstract  void sound();
	
	void move();         //=public abstract void move(); *******************IMPORTANT


}
