package javamapbasics;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
/**
 * Example of hashmap to store key and value pair
 * 
 * @param args
 */
	public static void main(String[] args) {
		HashMap <Integer, String> map = new HashMap<Integer ,String>();//creating HashMap
		map.put(1, "Mango");//put elements in map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		
		System.out.println("Iterating hashmap");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
