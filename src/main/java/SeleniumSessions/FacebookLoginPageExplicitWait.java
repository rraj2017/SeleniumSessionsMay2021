package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginPageExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 WebDriverWait wait1 = new WebDriverWait(driver ,20);
		wait1.until(ExpectedConditions.titleContains("Facebook"));
		System.out.println(driver.getTitle());
		
		 By emailId = By.id("email");
		WebDriverWait wait = new WebDriverWait(driver ,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
		
	WebElement email=driver.findElement(emailId);
		WebElement password=driver.findElement(By.id("pass"));
		WebElement loginButton =driver.findElement(By.id("loginBtn"));
//		
		
	email.sendKeys("rituraj3101@hotmail.com");
	password.sendKeys("mObisy_2012");
	loginButton.click();

	}

}
