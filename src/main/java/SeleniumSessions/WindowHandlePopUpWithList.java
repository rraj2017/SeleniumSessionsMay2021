package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlePopUpWithList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource-demo.orangehrmlive.com");
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>(handles);
		String parentWindowId = handlesList.get(0);
		String childWindowId = handlesList.get(1);
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
