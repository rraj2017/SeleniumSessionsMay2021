package javainterviewprograms;

public class WhiteSpaceRemoval {

	public static void main(String[] args) {
		String str = "OneSpace TwoSpaces  ThreeSpaces   FourSpaces    Tab	End";
		System.out.println(str.replaceAll("\\str+", ""));

	}
	public static void removeSpaces(String inputString) {
		char[] ch = inputString.toCharArray();
		String stringWithoutSpaces = "";
		for(int i =0; i<ch.length;i++) {
			if ( (ch[i] != ' ') &&(ch[i] != '\t') )
            {
                stringWithoutSpaces = stringWithoutSpaces + ch[i];
            }
		}
	}

}
