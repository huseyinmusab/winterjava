package day35maps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


    public class ConvertCsvToMap {
	/*
	 * ReAD A CSV FILE AND CONVERT IT TO A MAP
	 * csv===> Name,Ali        ==>Map:{Name=Ali, Id=101,Adress=Miami}
	 *         Id,101
	 *         Adress,Miami
	 */

	public static void main(String[] args) {

		convertCsvToMap();
		
	}
	public static Map<String, String> convertCsvToMap()  {
		
		BufferedReader br;//read line
		List<String> linesList= new ArrayList<>();
		HashMap<String, String>hm =new HashMap<>();
		
		
		
		try {
			br= new BufferedReader(new FileReader("C:\\Users\\Salak\\eclipse-workspace\\winterjava\\src\\day35maps\\myFile.csv"));
					
				String lines= br.readLine();
				
				while(lines!=null) {
					linesList.add(lines);//add it into the list
					lines=br.readLine();//read the next line
				}
						
		} catch (IOException e) {

			System.out.println("File couldny be read: " + e.getMessage());
		}
		
		System.out.println(linesList);//[Name, Ali, Id, 101, Adress, Miami, School, FIU]
		
		for (String w : linesList) {
			String arr[]=w.split(",");
			hm.put(arr[0].trim(), arr[1].trim());
			
			
		}
		System.out.println(hm);//{School=FIU, Adress=Miami, Id=101, Name=Ali}

		
		
		
		
		
		return hm;		
	}

}
