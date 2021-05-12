package javainterviewprograms;

public class PrimeNumberExample {

	public static void main(String[] args) {
		 primeNumber(15);
		}
	public static void primeNumber(int no) {
		int temp=0;
		for(int i =2;i<=no-1;i++) {
			if(no%i==0) {
				temp = temp +1;
			}
		}
			if(temp>0) {
				System.out.println( no + " is not prime number");
			}
			else {
				System.out.println(no + " is prime number");
			}
	}

	}


