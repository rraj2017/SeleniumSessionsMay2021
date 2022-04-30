package javainterviewprograms;

public class StringRotation {

	public static void main(String[] args) {
		rotateString("rituraj" ,"rajritu");
	}
	private static void rotateString(String st1 , String st2) {
		if(st1.length()!=st2.length()) {
			System.out.println(st2 + "is not rotated version of " + st1);
		}
		else {
			
			String st3 = st1 + st1;
			if(st3.contains(st2)) {
				System.out.println(st2 + " is rotated version of " + st1);
			}
			else {
				System.out.println(st2 + " is not rotated version of " + st1);
			}
		}
	}

}
