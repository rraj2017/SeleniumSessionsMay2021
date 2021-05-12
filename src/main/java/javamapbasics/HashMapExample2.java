package javamapbasics;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
/**
 * Different ways to insert elements in hashmap
 * @param args
 */
	public static void main(String[] args) {
		
    HashMap<Integer,String> hm = new HashMap<Integer,String>();
      hm.put(1, "Amit");
      hm.put(2, "Duke");
      hm.put(3, "piyush");
      hm.put(4, "Tom");
      System.out.println("Initial list of elements: "+hm);  
      
      System.out.println("After invoking put() method ");
      for(Map.Entry<Integer, String> m: hm.entrySet()) {
    	  System.out.println(m.getKey() + " " + m.getValue());
      }
      
       hm.putIfAbsent(5, "Aman");
       System.out.println("After invoking putIfAbsent() method ");  
       
       for(Map.Entry<Integer, String> m: hm.entrySet()) {
     	  System.out.println(m.getKey() + " " + m.getValue());
       }
       HashMap<Integer,String> map=new HashMap<Integer,String>();  
       map.put(5, "Sid");
       map.putAll(hm);
       System.out.println("After invoking putAll() method ");  
       for(Map.Entry m:map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
           }  

      
      
	}
	

}
