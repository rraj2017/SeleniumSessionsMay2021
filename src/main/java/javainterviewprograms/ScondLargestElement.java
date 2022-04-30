package javainterviewprograms;

public class ScondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {6,8,4,5,2,3,1};
		int temp;
		for(int i =0;i<a.length;i++) {
			
			for(int j =i +1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					
					temp =a[i];
					a[i]= a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("second largest element is : " + a[1]);

	}

}
