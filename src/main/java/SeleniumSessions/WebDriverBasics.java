package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {
   /**
    * this method code invokes the chrome browser , hit the url , get the title of the page and validate, get the current url quit and close explanation, 
    * @param args
    */
	public static void main(String[] args) {
	//   System.setProperty("webdriver.chrome.driver", "/Users/rituraj/Downloads/chromedriver");
	   WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver(); //open the browser // one session Id(Ex: 68dba2d8a0b149a1d3afac56fa74648032bcf46b) will be created and from now onwards for each of the next line driver statements session id will be passed too along with the request.
       driver.get("http://google.com");//2.enter url 
     //  driver.get("https://facebook.com");
      String title =  driver.getTitle();//3.get the page title
       System.out.println(title);
       
       //validation point:
       if(title.equals("Google")) {
    	   System.out.println("Correct title");
       }
       else {
    	   System.out.println("in-correct title");
       }
      System.out.println(driver.getCurrentUrl());
      // System.out.println(driver.getPageSource());
  //     driver.quit();//close the browser //session id will be null //termination of the driver 
       driver.close();//close the browser /session id will be expired or invalid
       System.out.println(driver.getTitle());//session id is null .using WebDriver after calling quit()? 
       //in this statement session id is passed as null to the chrome driver server along with the request and server will not send this request to the browser
       //immediately server will send the response back //session id is null .using WebDriver after calling quit()? 
	}
	//quit will make the session id as null but close will not make
	// the session id as null , it will say whatever session id you are using is now expired
}


