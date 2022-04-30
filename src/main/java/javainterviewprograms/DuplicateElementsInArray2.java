package javainterviewprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsInArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {3,5,4,3,2,2,1};
		Map<Integer , Integer> hm = new HashMap<>();
		for(int no:a) {
			if(hm.containsKey(no)) {
				hm.put(no, hm.get(no)+1);
			}
			else {
				hm.put(no, 1);
			}
		}
		
		Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
		for(Map.Entry<Integer, Integer> me:es) {
			if(me.getValue()>1) {
				System.out.print( " " + me.getKey());
		}
		}
		

	}

}
