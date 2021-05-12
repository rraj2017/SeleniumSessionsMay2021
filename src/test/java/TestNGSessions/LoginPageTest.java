package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	WebDriver driver;
	SoftAssert softAssert;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://classic.freecrm.com");
		softAssert = new SoftAssert();
		
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
	@Test
	public void loginTest() {
		driver.findElement(By.name("username")).sendKeys("ritu01");
		driver.findElement(By.name("password")).sendKeys("ritu@3101");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("Logout")).isDisplayed();
		String text = driver.findElement(By.xpath("//h2[contains(text(),'CRMPRO : Upgrade to Pro Account')]")).getText();
		System.out.println("text displayed :" + text);
		Assert.assertEquals(text, "CRMPRO : Upgrade to Pro Account");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
