package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select select = new Select(day);
//		select.selectByVisibleText("5");
//		select.selectByIndex(10);
//		
//		Select select1 = new Select(month);
//		select1.selectByVisibleText("May");
//		
//		Select select2 = new Select(year);
//		select2.selectByVisibleText("1995");
		
//		selectValueFromDropdownByText(day ,"5");
//		selectValueFromDropdownByText(month,"may");
//		selectValueFromDropdownByText(year,"1990");
		System.out.println(select.isMultiple());
		
	}
	/**
	 * This method is used to select the value from a drop-down on the basis of given text
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropdownByText(WebElement element , String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}
	/**
	 * This method is used to select the value from a drop-down on the basis of given index
	 * @param element
	 * @param index
	 */
	public static void selectValueFromDropdownByIndex(WebElement element , int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
		
	}


}
