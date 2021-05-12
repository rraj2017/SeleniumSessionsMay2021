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

public class SignUpTest {
WebDriver driver;
	
	@BeforeTest
	@Parameters({"url", "browser"})
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
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(appUrl);
		
	}
	@Test(priority=1)
	public void signUpLinkTest() {
		boolean flag = driver.findElement(By.linkText("Sign Up")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
