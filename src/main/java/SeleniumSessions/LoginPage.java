package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//page objects:
		By emailId = By.id("email");
		By password = By.id("pass");
		By loginButton=By.id("u_0_b");
		
		Util util = new Util(driver);
//		util.getElement(emailId).sendKeys("rituraj3101@hotmail.com");
//		util.getElement(password).sendKeys("mObisy_2012");
//		util.getElement(loginButton).click();
		
		//using the utilities method 
		String title = util.waitForTitlePresent("Facebook", 10);
		System.out.println(title);
		util.waitForElementToBePresent(emailId, 5).sendKeys("rituraj3101@hotmail.com");
	//	util.doSendKeys(emailId, "rituraj3101@hotmail.com");
		util.doSendKeys(password, "mObisy_2012");
		util.doClick(loginButton);
		
		driver.quit();
		

	}

}
