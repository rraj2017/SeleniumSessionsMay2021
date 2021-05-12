package javainterviewprograms;

public class MissingElement {

	public static void main(String[] args) {
		int[] a = {7,6,5,4,3,1};
		int expectedNoOfElements = a.length + 1;
		int totalSum = expectedNoOfElements * (expectedNoOfElements+1)/2;
		System.out.println("total sum is : " + totalSum);
		int sum = 0;
		for(int i =0;i<a.length;i++) {
			sum = sum + a[i];
		}
		System.out.print("Missing elements in array :" + (totalSum-sum));

	}

}
