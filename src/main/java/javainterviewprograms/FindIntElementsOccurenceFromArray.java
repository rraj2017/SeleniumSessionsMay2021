package javainterviewprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindIntElementsOccurenceFromArray {

	public static void main(String[] args) {
	   
		int []a = {10,20,30,40,50,20,10,5};
		
		Map<Integer , Integer> hm = new HashMap<Integer, Integer>();
		for(int no:a) {
			if(hm.get(no)==null) {
				hm.put(no, 1);
			}
			else {
				hm.put(no, hm.get(no)+1);
			}
		}
      
		Set<Map.Entry<Integer, Integer>> me = hm.entrySet();
		for(Map.Entry<Integer ,Integer> es: me) {
			if(es.getValue()>1) {
				System.out.println( " " + es.getKey()+ " =" + es.getValue());
			}
		}
		
	}

}
