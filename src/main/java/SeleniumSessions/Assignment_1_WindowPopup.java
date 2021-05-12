package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_1_WindowPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		driver.findElement(By.linkText("Good PopUp #4")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		System.out.println("parent window id is :" + parentWindowId);
		String childWindowId_1 = it.next();
		System.out.println(" First Child window id is :" + childWindowId_1);
		String childWindowId_2 = it.next();
		System.out.println("Second Child window id is :" + childWindowId_2);
		driver.switchTo().window(childWindowId_1);
		System.out.println("title of the first child window is :" + driver.getTitle());
		driver.close();
		driver.switchTo().window(childWindowId_2);
		System.out.println("title of the second child window is : " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("title of the parent window is :" + driver.getTitle());
		driver.quit();
		
		

	}

}
