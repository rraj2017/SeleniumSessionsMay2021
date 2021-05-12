package javainterviewprograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		checkPalindromeNumber(121);

	}
	public static void checkPalindromeNumber(int no) {
		int temp = no;
		int rev =0 ,rem;
		while(temp !=0) {
			rem=temp%10;
			rev = rev *10 + rem;
			temp = temp /10;
		}
		System.out.println("reverse is : " + rev);
		if(no==rev) {
			System.out.println(no +" is a palindrome number");
		}
		else {
			System.out.println(no +  " is not a palindrome number");
		}
	}

}
