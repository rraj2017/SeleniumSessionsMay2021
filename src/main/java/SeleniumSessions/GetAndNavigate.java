package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/RituRaj/browser_drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get() will wait until the page loaded completely
		driver.get("https://www.amazon.in");//in case of get() , once the page gets fully loaded then only the next line of the statement i.e printing the title to the console gets executed
		System.out.println(driver.getTitle());
		
		//navigate().to() ---> it does not wait for the loading of the complete page and next line gets executed
		driver.navigate().to("https://www.amazon.in");
		System.out.println(driver.getTitle());

	}

}
