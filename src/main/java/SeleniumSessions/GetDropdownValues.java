package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropdownValues {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		getDropdownValues(day);
		getDropdownValues(month);
		getDropdownValues(year);
	}
    /**
     * This method is used to get all the values from drop down
     * @param element
     */
	public static void getDropdownValues(WebElement element) {
		System.out.println("**************************");
		Select select = new Select(element);
		List<WebElement> dropList = select.getOptions();
		System.out.println("total number of values in dropdown : " + dropList.size());
		for (int i = 0; i < dropList.size(); i++) {
			String text = dropList.get(i).getText();
			System.out.println(text);
		}

	}

}
