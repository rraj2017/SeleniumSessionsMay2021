package javainterviewprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EachCharCountInString {

	public static void main(String[] args) {
	//	characterCount("Java J2EE Java JSP J2EE");
		wordCount("JAVA JAVA");

	}
	private static void characterCount(String inputString) {
		//1.Creating a HashMap containing char as a key and occurrences as a value
		HashMap<Character , Integer> charCountMap = new HashMap<Character , Integer>();
		//2.Converting given string to char array
		char[] strArray = inputString.toCharArray();
		//3.checking each char of strArray
		for(char ch:strArray) {
			if(charCountMap.containsKey(ch)) {
				//If char 'ch' is present in charCountMap, incrementing it's count by 1
				charCountMap.put(ch, charCountMap.get(ch) +1);
			}
			else {
				//If char 'ch' is not present in charCountMap,
                //putting 'ch' into charCountMap with 1 as it's value
				charCountMap.put(ch, 1);
			}
		}
		//Printing inputString and charCountMap 
		
		System.out.println(inputString + ":" + charCountMap);
		
	}
	
	
	private static void wordCount(String inputString1) {
		//1.Creating a HashMap containing char as a key and occurrences as a value
		HashMap<String , Integer> stringCountMap = new HashMap<String , Integer>();
	    
	     String[]words= inputString1.split(" ");
	     System.out.println(Arrays.toString(words));
		//3.checking each char of strArray
		for(String s:words) {
			if(stringCountMap.containsKey(s)) {
				//If string 's' is present in stringCountMap, incrementing it's count by 1
				stringCountMap.put(s, stringCountMap.get(s) +1);
			}
			else {
				//If string 's' is not present in stringCountMap,
                //putting 's' into stringCountMap with 1 as it's value
				stringCountMap.put(s, 1);
			}
		}
		//Printing inputString and charCountMap 
		
	//	System.out.println(inputString1 + ":" + stringCountMap);
		
		for(Map.Entry<String, Integer> entry :stringCountMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
	

}
