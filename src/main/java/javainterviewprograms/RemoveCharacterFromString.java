package javainterviewprograms;

public class RemoveCharacterFromString {

	public static void main(String[] args) {
      String s= removeCharacter("I love java" ,5);
      System.out.println(s);
	}
	
	public static String removeCharacter(String str , int p) {
		 return str.substring(0, p) + str.substring(p +1);
	}

}
