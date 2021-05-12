package javainterviewprograms;

public class Anagram {

	public static void main(String[] args) {
		isAnagram("Mother In Law", "Hitler Woman");

	}
	private static void isAnagram(String s1 , String s2) {
		
		//removing white spaces
		String copyOfS1 = s1.replaceAll("\s", "");
		String copyOfS2 = s2.replaceAll("\s", "");
		
		//Initially setting status as true
		boolean status = true;
		
		//comparing the length of both strings
		if(copyOfS1.length()!=copyOfS2.length()) {
			status = false;
		}
		else {
			char [] strArray1 = copyOfS1.toLowerCase().toCharArray();
			//Checking whether each character of strArray1 is present in copyOfs2
			for(char c:strArray1) {
				int index = copyOfS2.indexOf(c);
				if(index!=-1) {
					//If character is present in copyOfs2, removing that char from copyOfs2
					copyOfS2 = copyOfS2.substring(0, index)+copyOfS2.substring(index+1,copyOfS2.length());
				}
				else
                {
                    //If character is not present in copyOfs2, setting status as false and breaking the loop
 
                    status = false;
 
                    break;
                }
			}
		}
		//Output
		 
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
		
	

}
