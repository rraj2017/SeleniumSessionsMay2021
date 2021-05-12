package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * to handle browser window /window popup 
 */
public class WindowPopupHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();//iterator(works likes a loop) is used to get the values from those collections which does not maintain order
		String parentWindowID = it.next();
		System.out.println("Parent window ID is : " + parentWindowID);
		String childWindowID = it.next();
		System.out.println("Child window ID is : " + childWindowID);
		driver.switchTo().window(childWindowID);//switch to child window
		System.out.println("Child window title is :" + driver.getTitle());
		driver.close();// close the child window popup , driver is lost after closing the child window popup
		driver.switchTo().window(parentWindowID);//switch to parent window
		System.out.println("Parent window title is :" + driver.getTitle());
		driver.quit();
		

	}

}
