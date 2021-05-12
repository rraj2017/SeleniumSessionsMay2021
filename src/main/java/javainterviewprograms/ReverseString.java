package javainterviewprograms;

public class ReverseString {

	public static void main(String[] args) {
		reverseString("JAVA");
	}
	
	public static void reverseString(String original) {
		String reverse ="";
		int length = original.length();
		for(int i =length-1;i>=0;i--) {
			reverse = reverse + original.charAt(i);
			
		}
		System.out.println("reverse of string is :" + reverse);
		
	}
	}


