package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * in this we are entering value inside a field using Actions class sendkeys method
 * also develop generic method to enterText using Actions class sendkeys method
 * moveToElement method is called internally for Actions class sendkeys method and click method
 */
public class ActionsEvents {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement loginButton= driver.findElement(By.name("login"));
		
	//	Actions action = new Actions(driver);
	//	action.sendKeys(inputBox, "test@gmail.com").build().perform();
		enterText(email,"test@gmail.com");
		enterText(password,"test1234");
		clickOnElement(loginButton);
		

	}
	public static void enterText(WebElement element ,String value) {
		Actions action = new Actions(driver);
		action.sendKeys(element, value).build().perform();
	}
	public static void clickOnElement(WebElement element) {
		Actions action = new Actions(driver);
		action.click(element).build().perform();
		
	}

}
