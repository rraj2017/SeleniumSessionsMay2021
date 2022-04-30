package javainterviewprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
//		System.out.print("Duplicate elements are : ");
		int []a = {3,5,4,3,2,2,1};
//		 for(int i =0;i<a.length-1;i++) {
//			 
//			 for(int j =i+1;j<a.length;j++) {
//				 if((a[i]==a[j]) && (i!=j)){
//					System.out.print(a[j] + " "); 
//				 }
//			 }
//		 }
//		
//
//	}
		
	
	
//	Set<Integer> s = new HashSet<>();
//	for(int no:a) {
//		if(s.add(no)==false) {
//			System.out.print(no + " ");
//		}
//	}
    
		Map<Integer , Integer> hm = new HashMap<>();
		for(int no:a) {
			Integer count = hm.get(no);
			if(count ==null) {
				hm.put(no, 1);
			}
			else {
				count = count + 1;
				hm.put(no, count);
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
