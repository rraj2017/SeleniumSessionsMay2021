package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		//WebDriverManager checks what is your operating system , which browser is looking for and it automatically downloads chromedriver, it will comfigure the stable version of driver 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
