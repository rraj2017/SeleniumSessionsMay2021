package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com");
		
	    By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//input[@value='Login']");
		
		getElementWithWait(driver,username,2).sendKeys("batchautomation");
		driver.findElement(password).sendKeys("Test@12345");
		driver.findElement(login).click();
	}
	
	public static WebElement getElementWithWait(WebDriver driver , By locator , int timeOut) {
		WebElement element = null;
		for(int i =0; i<timeOut; i++) {
			try {
				element = driver.findElement(locator);
				break;
			}
			catch(Exception e) {
				System.out.println("Waiting for element to be present on the page ---> " + i + "secs");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					
				}
			}
		}
		return element;
	}
	
	public static boolean isElementDisplayed(WebDriver driver , By locator , int timeOut) {
		WebElement element = null;
		boolean flag = false ;
		
		for(int i =0; i<timeOut; i++) {
			try {
				element = driver.findElement(locator);
				flag = element.isDisplayed();
				break;
			}
			catch(Exception e) {
				System.out.println("Waiting for element to be present on the page ---> " + i + "secs");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					
				}
			}
		}
		return flag;
	}

}
