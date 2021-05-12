package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageCase2 {
WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://classic.freecrm.com");
		
	}
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title is :" + title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	@Test(priority=2)
	public void signUpLinkTest() {
	//	boolean flag = driver.findElement(By.linkText("Sign Up")).isDisplayed();
		Assert.assertTrue(driver.findElement(By.linkText("Sign Up")).isDisplayed());
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}
