package SeleniumSessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutlipleTabsOpening {
	
	@Test
	public void openMultipleBrowserTabs() {
		
		WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver(); 
	       driver.get("http://google.com");
	       
	       //........this code is to open the new tab.................
	       JavascriptExecutor jse = (JavascriptExecutor)driver;
	       jse.executeScript("window.open()");
	       
	       //..................1st way get all the tabs and switch using index .....................
	       ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	       driver.switchTo().window(tabs.get(1));
	       driver.get("https://flipkart.com");
	       driver.switchTo().window(tabs.get(0));
	       
	       
	       //.....................other method to get the window handles and then switch  ............
	       
	       Set<String> handles = driver.getWindowHandles();
	      Iterator<String> it = handles.iterator();
	      String mainTab =it.next();
	      System.out.println("main window id :" + mainTab);
	      String secondTab =it.next();
	      System.out.println("2nd window id :" + secondTab);
	      driver.switchTo().window(secondTab);
	      driver.get("https://flipkart.com");
	      driver.switchTo().window(mainTab);
	      
	      
	       
	       
	       
		
	}

}
