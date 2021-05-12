package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
WebDriver driver;
	
	@BeforeTest
	@Parameters({"url" ,"browser"})
	public void setUp(String appUrl ,String browserName) throws Exception {
	
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else {
			System.out.println("Please pass the correct browser name...");
			throw new Exception("NoSuchBrowserException");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(appUrl);
		
	}
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title is :" + title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.","login pagee title is mismtched");
	}
	@Test(priority=2)
	public void signUpLinkTest() {
		boolean flag = driver.findElement(By.linkText("Sign Up")).isDisplayed();
		Assert.assertTrue(flag);
	}
	@Test(priority=2)
	@Parameters({"username","password"})
	public void loginTest(String emailId , String pwd) throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys(emailId);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).isDisplayed();
		String text = driver.findElement(By.xpath("//h2[contains(text(),'CRMPRO : Upgrade to Pro Account')]")).getText();
		System.out.println("text displayed :" + text);
		Assert.assertEquals(text, "CRMPRO : Upgrade to Pro Account");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
