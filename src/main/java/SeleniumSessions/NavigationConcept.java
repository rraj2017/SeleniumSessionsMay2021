package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * back and forward simulation in browser
 * @author RituRaj
 *
 */
public class NavigationConcept {
/**
 *  back and forward simulation in browser
 * @param args
 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/RituRaj/browser_drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.amazon.in");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
	}

}
