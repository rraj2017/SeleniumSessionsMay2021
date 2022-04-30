package javainterviewprograms;

public class StarPattern {

	public static void main(String[] args) {
	   
		for(int i=1;i<=4;i++) {
			
			for(int j=9;j>=i;j--) {
				System.out.print("X");
			}
			System.out.println();
		}

	}

}
