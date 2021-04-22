package day26exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {
	
	
    //When you use multiple catch blocks, make the child one first
	public static void main(String[] args) {

		 FileInputStream fis = null;
	       try {
	    	   
	             fis = new FileInputStream("src\\day26exceptions\\Exception");//i am TRYING to access to the file	            
	            int k;
	            while((k = fis.read())!=-1) {//read() returns integer,why? every letter has an ascii value,and by using this while loop i will read them one by one
	                System.out.print( (char) k); //and why we use -1. because ASCII value starts from zero,And (char) k===> ia m doing explicit narrowing here
	            }
	            
	        } catch (FileNotFoundException e) {// java says if there is a problem i will catch it
	        
	            System.out.println("The path is wrong or file deleted");//we can also give our own messages
	        
	        } catch (IOException e) {
	            
	            System.out.println("The file could not be read");
	        }
	        
	        try {
	            fis.close();
	        } catch (IOException e) {
	            System.out.println("The file could not be closed");
	        }
		
		
		
	}

}
