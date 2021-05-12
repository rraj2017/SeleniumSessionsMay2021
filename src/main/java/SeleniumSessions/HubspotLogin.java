package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubspotLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	
		 WebDriver driver = new ChromeDriver();
		 Util util = new Util(driver);
		driver.get("https://app.hubspot.com/login");
		util.waitForTitlePresent("Hubspot Login", 5);
		
		//page objects:
		By Signup = By.linkText("Sign up");
		By password = By.id("pass");
		By loginButton=By.id("u_0_b");
		util.clickWhenReady(Signup, 6);
		
	}

}
