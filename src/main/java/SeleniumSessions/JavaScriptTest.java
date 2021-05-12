package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(JavaScriptUtil.getTitleByJS(driver));
	//	JavaScriptUtil.generateAlert(driver, "This is my code");
	//	JavaScriptUtil.refreshBrowserByJS(driver);
		System.out.println(JavaScriptUtil.getBrowerInfo(driver));
	//	JavaScriptUtil.sendKeysUsingJSWithId(driver, "username", "ritu01");
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		WebElement loginForm = driver.findElement(By.id("loginForm"));
	    //JavaScriptUtil.drawBorder(loginForm, driver);
	//	JavaScriptUtil.flash(loginForm, driver);
	//	JavaScriptUtil.drawBorder(loginButton, driver);
	    //JavaScriptUtil.clickElementByJS(loginButton, driver);
	//	System.out.println(JavaScriptUtil.getPageInnerText(driver));
	//	JavaScriptUtil.scrollPageDown(driver);
		WebElement forgotPassword = driver.findElement(By.linkText("Forgot Password?"));
		JavaScriptUtil.scrollIntoView(forgotPassword, driver);

	}

}
