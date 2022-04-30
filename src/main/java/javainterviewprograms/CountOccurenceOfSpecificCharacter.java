package javainterviewprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOccurenceOfSpecificCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java is java again java again";
		char c ='a';
		int count = s.length()-s.replace("a", "").length();
		
         System.out.println("Number of occurances of 'a' in "+s+"= "+count);
	}

}
