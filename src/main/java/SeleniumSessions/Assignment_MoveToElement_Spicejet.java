package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * assignment- to create a generic method for mouse hover using #moveToElement method of Actions class 
 */
public class Assignment_MoveToElement_Spicejet {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	//	Actions action = new Actions(driver);
    	WebElement login = driver.findElement(By.id("ctl00_HyperLinkLogin"));
	 //  action.moveToElement(login).build().perform();
		WebElement spiceClubMembers = driver.findElement(By.linkText("SpiceClub Members"));
	//	action.moveToElement(spiceClubMembers).build().perform();
		WebElement membersLogin = driver.findElement(By.linkText("Member Login"));
	//    membersLogin.click();	
		
		performMouseHover(driver,login);
		performMouseHover(driver,spiceClubMembers);
		membersLogin.click();

	}
	public static void performMouseHover(WebDriver driver ,WebElement element ) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		
		
	}

}
