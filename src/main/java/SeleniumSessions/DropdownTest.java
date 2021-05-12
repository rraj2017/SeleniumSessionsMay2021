package SeleniumSessions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTest {

	public static void main(String[] args) throws InterruptedException {
	  
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		String date = "20-Dec-1996";
		String dateVal[] = date.split("-");
		DropdownUtil.selectValueFromDropdownByText(day, dateVal[0]);
		DropdownUtil.selectValueFromDropdownByText(month, dateVal[1]);
		DropdownUtil.selectValueFromDropdownByText(year, dateVal[2]);
		
		ArrayList<String> monthList = DropdownUtil.getDropdownValues(month);
		System.out.println(monthList);
		
		ArrayList<String> dayList = DropdownUtil.getDropdownValues(day);
        System.out.println(dayList);
        
        ArrayList<String> yearList = DropdownUtil.getDropdownValues(year);
		System.out.println(yearList);
        
	}

}
