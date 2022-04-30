package javainterviewprograms;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "i like this program very much";
		String reverse ="";
		String[] words = original.split(" ");
		
		for(int i =words.length-1; i>=0;i--) {
			
			reverse = reverse + words[i] + " ";
			
			
		}
		System.out.println("reverse string : " + reverse.substring(0 ,reverse.length()-1));

	}

}
