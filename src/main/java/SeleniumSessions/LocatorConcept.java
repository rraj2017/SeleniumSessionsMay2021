package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	/**
	 * Explaining the locator concept
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
	   
		System.setProperty("webdriver.chrome.driver", "C:/Users/RituRaj/browser_drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		//1. id:--1.always unique
//		driver.findElement(By.id("username")).sendKeys("rraj.selenium@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Merkur_123");
//		driver.findElement(By.id("loginBtn")).click();
		
		//2.name :2
//		driver.findElement(By.name("email")).sendKeys("test@gamil.com");
		
		//3.xpath:-3-in case of dynamic id's
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test!123");
		
		//4.Css Selector:-3
//		driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("test@123");
		
		//5. Class Name-4 - is not always unique
		
//		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.className("login-password")).sendKeys("test123");
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		
       //6.link text: Only used for links
		driver.findElement(By.linkText("Sign up")).click();
		//7.partial link text:
		driver.findElement(By.partialLinkText("Sign")).click();
		
	}

}
