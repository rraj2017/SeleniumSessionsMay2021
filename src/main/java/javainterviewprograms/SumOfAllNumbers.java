package javainterviewprograms;

public class SumOfAllNumbers {

	public static void main(String[] args) {
		sumOfAllDigits(741);

	}
	public static void sumOfAllDigits(int inputNumber) {
		int temp = inputNumber;
		//initializing the sum to zero
		int sum = 0;
		while(temp!=0) {
			//Getting last digit of the input number
			int lastDigit = temp%10;
			//Adding last digit to sum
			sum = sum + lastDigit;
			//Removing the last digit from the input number
			temp = temp /10;
			
		}
		//Printing sum
		 
        System.out.println("Sum Of All Digits In "+inputNumber+" = "+sum);
	}

}
