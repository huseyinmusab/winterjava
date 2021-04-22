package day17lists; 

import java.util.ArrayList;
import java.util.List;

public class List01 {

	public static void main(String[] args) {

		List<String> list1 =new ArrayList<>();
		list1.add("Ahmed");
		list1.add("Yavuz");
		list1.add("Cemal");
		list1.add("Sibel");
		list1.add(2, "Ali");
		list1.add("Veli");
		list1.add("Yavuz");

        System.out.println(list1);
        System.out.println(list1.size());//7
		
        //to GET a specific elemenent in list
        System.out.println(list1.get(2));//Ali
        //System.out.println(list1.get(6));//Run Time Error
        
        
        //to get an index of specific element
        System.out.println(list1.indexOf("Cemal"));//3
        System.out.println(list1.indexOf("X"));//-1
        System.out.println(list1.indexOf("Yavuz"));//The first occurance 
        System.out.println(list1.lastIndexOf("Yavuz"));//6
        
        //How to REMOVE an element from a list?
        //There are 2 remove() methods
        //1) remove(index)=>        returns element that is removed
        //2) remove(elements name)==>returns boolean
        
        
        System.out.println(list1.remove(2));
        System.out.println(list1);
        
        System.out.println(list1.remove("Sibel"));//True
        System.out.println(list1.remove("x"));//false
        System.out.println(list1);
        
        
        //Lists are MUTABLE(DEGISKEN),you can update them without assigning
        //STRINGS ARE IMMUTABLE (DEGISMEZ)====> YOU CAN NOT CHANGE THEM UNLESS ASSIGNMENT
        String s="Strings are immutable"; 
        String str =s.replace("are", ""); // I must give another name,another assignment to String s---->str
        
        System.out.println(s);  //Strings are immutable

        System.out.println(str);//Strings  immutable

        
        
        
       //to UPDATE elements in lists with SET():
        list1.set(2, "John");
        System.out.println(list1); //[Ahmed, Yavuz, John, Veli, Yavuz]

        
        
        //to get a part of a list()
        //sublist() <---like---> substring() ,first index is inclusive,second index is exclusive
        System.out.println( list1.subList(1, 3));
       
       
       List<String> list2= new ArrayList<>();
       list2.add("Ayse");
       list2.add("Serife");
       list2.add("Recep");
       
       list1.addAll(list2);
       System.out.println(list1);//[Ahmed, Yavuz, John, Veli, Yavuz, Ayse, Serife, Recep]
       System.out.println(list2);//[Ayse, Serife, Recep]
       
       
       //to add list in a specific index
       list1.addAll(2, list2);
       System.out.println(list1);//[Ahmed, Yavuz, Ayse, Serife, Recep, John, Veli, Yavuz, Ayse, Serife, Recep]
       
       
       //to remove multiple elements:
       //removeAll() removes all the elements that has same name
       list1.removeAll(list2);
       System.out.println(list1);//[Ahmed, Yavuz, John, Veli, Yavuz]
       
       
       
       //to remove all elements
       list1.clear();
       System.out.println(list1);//[]
       
       
       //to check if list has element or ot
       System.out.println(list1.isEmpty());//true
       



       
       
		
		
	}

}
