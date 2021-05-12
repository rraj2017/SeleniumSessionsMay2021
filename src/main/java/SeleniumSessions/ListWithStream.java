package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStream {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//		By industry = By.id("Form_submitForm_Industry");
//		By country = By.id("Form_submitForm_Country");
//		By industry_options = By.xpath("//select[@id='Form_submitForm_Industry']/option");
//		List<WebElement> indus_list = driver.findElements(industry_options);
//		long startTime =System.currentTimeMillis();
//		//indus_list.stream().forEach(ele->System.out.println(ele.getText()));//428 //sequential stream
//		
//		
//		indus_list.parallelStream().forEach(ele->System.out.println(ele.getText()));
//		long endTime =System.currentTimeMillis();
//		System.out.println(endTime-startTime);
		
		driver.get("https://amazon.in");
		By links = By.tagName("a");
		List<WebElement> indus_list = driver.findElements(links);
		long startTime =System.currentTimeMillis();
	//	indus_list.stream().forEach(ele->System.out.println(ele.getText()));//4979 milliseconds
		indus_list.parallelStream().forEach(ele->System.out.println(ele.getText()));//4138 milliseconds
		long endTime =System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
	

}
