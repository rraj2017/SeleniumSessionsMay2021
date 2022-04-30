package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
	//	driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//strong[text()='Argentina']"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(8000);
		selectCountry(driver ,"Argentina");
		driver.quit();

	}
	
	public static void selectCountry(WebDriver driver , String countryName) {
		WebElement countryCheckbox =driver.findElement(By.xpath("//strong[text()='"+countryName+"']//parent::td//preceding-sibling::td//input[@type='checkbox']"));
		Actions action = new Actions(driver);
		action.click(countryCheckbox).build().perform();
	}

}
