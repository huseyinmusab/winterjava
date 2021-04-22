package day15arrays;

import java.util.Arrays;

public class Arrays03 {
	/*
	 * ONE MORE STRING METHOD
	 * split() method is used to split a String by using specific character/s
	 * split() methods puts the splitted parts into an array
	 * 
	 */

	public static void main(String[] args) {
		String str = "JavaGood";
		String arr[] =str.split("a");
		System.out.println(Arrays.toString(arr));//[J, v, Good]


		String brr[]= str.split("");
		System.out.println(Arrays.toString(brr));//[J, a, v, a, G, o, o, d]
		
		System.out.println(brr.length);//8
		
		String str2  = "Ali Can come here no i do not wanna come";
		String crr [] =str2.split(" ");
		System.out.println(Arrays.toString(crr));//[Ali, Can, come, here, no, i, do, not, wanna, come]
		System.out.println(crr.length);//10
	}

}
