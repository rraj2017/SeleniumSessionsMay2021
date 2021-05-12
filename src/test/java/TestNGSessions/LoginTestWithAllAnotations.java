package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithAllAnotations {
	
	
	//Before : @BeforeSuite , @BeforeTest ,@BeforeClass , @BeforeMethod
	//Test: @Test
	//After : @AfterMethod , @AfterClass, @AfterTest, @AfterSuite
	
	/*
	 * Bs
	 * BT
	 * BC
	 * 
	 * BM
	 * T1
	 * AM
	 * 
	 * BM
	 * T2
	 * AM
	 * 
	 * AC
	 * AT
	 * AS
	 */
	
	WebDriver driver;
	By username = By.name("username");
	By password = By.name("password");
	By login = By.xpath("//input[@value='Login']");
	By signup = By.linkText("Sign Up");
	By homePageHeader = By.xpath("//td[@class='logo_text']");
	By homePageLink = By.linkText("Home");
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite->prepare test data");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test--->DB connection");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class-->get the value from DB");
	}
	//@BeforeTest
	@BeforeMethod
	public void setup() {
		System.out.println("before method-->setup");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void signupLinkTest() {
		System.out.println("test method-->test 1");
		Assert.assertTrue(driver.findElement(signup).isDisplayed());
	}
	@Test(priority=2 , enabled = false)
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	@Test(priority=3 , enabled = false)
	public void loginTest() {
		driver.findElement(username).sendKeys("batchautomation");
		driver.findElement(password).sendKeys("Test@12345");
		driver.findElement(login).click();
		String title = driver.getTitle();
		Assert.assertEquals(title,"CRMPRO");
	}
	//@AfterTest
	@AfterMethod
	public void tearDown() {
		System.out.println("after method-->driver quiting");
		driver.quit();
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after class-->delete the user");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after test-->disconnect the DB");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite-->delete my test data");
	}
}
