package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("input-email")).sendKeys("ritu.gamer@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("ritu@3101");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		//get the list of all the links:
		List<WebElement>linksList = driver.findElements(By.tagName("a"));
		System.out.println("size of all the links available ----->" + linksList.size());
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		
		//2.iterate linksList:exclude all the links which does not have any href attribute
		for(int i =0;i<linksList.size();i++) {
			if(linksList.get(i).getAttribute("href")!=null && (!linksList.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(linksList.get(i));
			}
		}
		//3.get the size of active links list :
		System.out.println("size of active links----->" + activeLinks.size());
		
		//4.check the href url with httpconnection api:
		for(int j=0;j<activeLinks.size();j++) {
			try {
				HttpURLConnection connection =(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
				connection.connect();
				String response =connection.getResponseMessage();//ok
				connection.disconnect();
				System.out.println(activeLinks.get(j).getAttribute("href") + "--->" +response );
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
