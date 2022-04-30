package javasessions;

public class SwitchExample {

	public static void main(String[] args) {
		String browserName ="chrome";
		switch(browserName)
		{
		 case "chrome":
			 System.out.println("running on chrome");
			 break;
			 
		 case "firefox":
			 System.out.println("running on firefox");
			 break;
		 case "edge":
			 System.out.println("running on edge");
			 break;
		 case "opera":
			 System.out.println("running on opera");
			 break;
		 case "safari":
			 System.out.println("running on safari");
			default:
				System.out.println("No browser match found");
			 
		}

	}

}
