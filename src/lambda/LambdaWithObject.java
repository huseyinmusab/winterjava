package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithObject {

	public static void main(String[] args) {

		       //Create 4 objects by using Course class
				Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
				Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
				Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
				Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
				
				//Add them into a list  ===> WHY? in functional programming we need collection
				List<Course> list = new ArrayList<>();
				list.add(courseTurkishDay);
				list.add(courseTurkishNight);
				list.add(courseEnglishDay);
				list.add(courseEnglishNight);
				
				System.out.println(checkAverage(list));
		
				
		
		
	}
	
	//Check if all average scores are less than 98
	public static boolean checkAverage(List<Course>list) {
		
	
		return 	list.stream().allMatch(t->t.getAverageScore()<98);
		
	}
}
