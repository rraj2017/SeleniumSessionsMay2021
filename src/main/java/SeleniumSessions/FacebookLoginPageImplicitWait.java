package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * selenium wait concepts
 * @author rituraj
 *
 */
public class FacebookLoginPageImplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 //applied for all the web elements on the page
		 //it is also called as global wait or dynamic wait
		 //it keeps on checking the element for the specified time and then if element is not found we will get NoSuchElementException
		 //it ignores the remaining pending time for the element if it is found quickly before the time overs.
		 //Total time -waiting time = pending time
		 //20 seconds is applied for each of the elements 
		 //for password field also 20 secs is applied but as it is available with email field so waiting time for it will be 0 
		 //20-0 = 20
		 
		 //drawbacks of implicit wait:
		 //1. the defined wait will be applied for each of the elements on the page as the implicit wait code is 
		 //globally declared and hence the wait will be applicable by default to each of the elements 
		 //does not matter it is consumed or not but the defined wait will be applied by default as the implicit wait code will be 
		 //called separately for each of the elements on the page .
		 
		 //2.Implicit wait only works for the web elements not for the title of the page and not for the url .
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//it will be applied for all the web selements by default
		 //Thread.sleep(5000);
		WebElement emailId=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		WebElement loginButton =driver.findElement(By.id("loginBtn"));
		
		
		emailId.sendKeys("rituraj3101@hotmail.com");
		//nullify or changing the implicit wait time , then after this much will be applied for each of the elements 
		 driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

}
