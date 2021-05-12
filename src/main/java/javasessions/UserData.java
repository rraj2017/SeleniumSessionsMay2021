package javasessions;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class UserData {

	public static void main(String[] args) {
	//	HashMap<String ,String > userMap = new HashMap<String , String>();
		Map<String ,String > userMap = new HashMap<String , String>();
		userMap.put("id", "1");
		userMap.put("name", "Tom");
		userMap.put("city", "Bangalore");
		userMap.put(null, "pune");
		userMap.put(null, "Hyderabad");//only one null key and multiple null values in Hashmap
		userMap.put("company", null);
		userMap.put("country", null);
		System.out.println(userMap.get("id"));
		System.out.println(userMap.size());
		
		for(Map.Entry m:userMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	
	//hashtable:
	
	Hashtable<String ,Integer > productTable = new Hashtable<String , Integer>();
	productTable.put("Apple Macbook", 2000);
	productTable.put("Windows HP Laptop", 1000);
	productTable.put("Apple iPhoneX", 1500);
	//productTable.put(null, null) ; ---> no null key and null value in Hashtable 
	
	System.out.println(productTable);
	System.out.println(productTable.get("Apple Macbook"));
	
	for(Map.Entry m:productTable.entrySet()) {
		System.out.println(m.getKey() + " " + m.getValue());
	}

}
	//Hashmap is non synchronized and it is not thread safe 
	
}
