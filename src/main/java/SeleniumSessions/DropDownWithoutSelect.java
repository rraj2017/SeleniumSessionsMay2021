package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(5000);
		String day = "//select[@id='day']/option";
		String month = "//select[@id='month']/option";
		String year = "//select[@id='year']/option";
		
		DropdownUtil.selectDropdownValueWithoutSelect(driver, day, "13");
		DropdownUtil.selectDropdownValueWithoutSelect(driver, month, "jun");
		DropdownUtil.selectDropdownValueWithoutSelect(driver, year, "1987");
		
		//.....below is the same code without utility................. 
		
//		List<WebElement> daysList = driver.findElements(By.xpath("//select[@id='day']/option"));
//		System.out.println(daysList.size());
//		for (int i = 0; i < daysList.size(); i++) {
//			String text = daysList.get(i).getText();
//			System.out.println(text);
//			if(text.equals("25")) {
//				daysList.get(i).click();
//				break;
//			}
//		}

	}

}
