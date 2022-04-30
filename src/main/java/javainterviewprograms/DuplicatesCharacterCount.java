package javainterviewprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesCharacterCount {

	public static void main(String[] args) {
		
		characterCount("Java is a programming language");

	}

	private static void characterCount(String inputString) {
		//1.Creating a HashMap containing char as a key and occurrences as a value
		HashMap<Character , Integer> charCountMap = new HashMap<Character , Integer>();
	//	String s2 =inputString.replaceAll(" ", "");
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
        
		Set<Map.Entry<Character ,Integer>> me =charCountMap.entrySet();
		for(Map.Entry<Character, Integer> hp:me) {
			if(hp.getValue()>1) {
				
				System.out.println(hp.getKey()+ " : " + hp.getValue());
			}
		}
		
		  
		
}
	
}
