package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_1_otherway_bestway_handle_windowpopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		System.out.println("parent window id is:" + parentWindowId);
		String childWindowId_1 = it.next();
		System.out.println("first child window id is:" + childWindowId_1);
		driver.switchTo().window(childWindowId_1);
		System.out.println("title of the first child window is :" + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("title of the parent window is :" + driver.getTitle());
		driver.findElement(By.linkText("Good PopUp #4")).click();
		Set<String> handles2 = driver.getWindowHandles();
		Iterator<String> it2 = handles2.iterator();
		String parentWindowId_2 = it2.next();
		System.out.println("parent window id is: " + parentWindowId_2);
		String childwindowdId_2 = it2.next();
		System.out.println("child window id of second child is :" + childwindowdId_2);
		driver.switchTo().window(childwindowdId_2);
		System.out.println("title of the second child window is:" + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId_2);
		driver.quit();

	}

}
