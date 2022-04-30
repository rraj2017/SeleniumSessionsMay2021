package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.fge.jsonschema.examples.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleXpathMakeMytripExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BLR-24/01/2022&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	WebElement checkbox = driver.findElement(By.xpath("//span[@class='filterName']//child::span[contains(text(),'IndiGo')]"));
     //   WebElement checkbox = driver.findElement(By.xpath("//span[@class='truncate']//parent::span[@title='IndiGo']"));
        selectAirlines("Refundable Fares" , driver);
	//	checkbox.click();
		driver.close();
	}
	public static void selectAirlines(String airlinesName,WebDriver driver) {
		 WebElement checkbox = driver.findElement(By.xpath("//span[@class='truncate']//parent::span[@title='"+ airlinesName +"']"));
		 checkbox.click();
	}

}
