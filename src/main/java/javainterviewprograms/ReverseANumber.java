package javainterviewprograms;

public class ReverseANumber {

	public static void main(String[] args) {
		reverseNumber(5432);

	}
	public static void reverseNumber(int no) {
		int rem , rev=0;
		while(no!=0) {
			rem=no%10;
			rev = rev*10 + rem;
			no=no/10;
			
		}
		System.out.println("reverse is :" + rev);
	}

}
