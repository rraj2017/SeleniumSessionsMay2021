package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * this method is to take the screenshot of the page using selenium 3 and take the screenshot of the 
 * element only using selenium 4 
 * generic to take screenshot of page and element
 * @author rituraj
 *
 */
public class ScreenshotConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//Takes the screenshot and store it in a file
	//File srcFile =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     //move or copy the src file to some other location
//	FileUtils.copyFile(srcFile, new File("./target/screenshots/page.png"));
		takePageScreenshot(driver, "loginpage");
		
		
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement loginButton= driver.findElement(By.name("login"));
		
		takeElementScreenshot(email, "emailid");
		takeElementScreenshot(password, "password");
		takeElementScreenshot(loginButton, "loginButton");
		driver.quit();
		
	}
	
	public static void takePageScreenshot(WebDriver driver,String fileName){
		File srcFile =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./target/screenshots/"+fileName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void takeElementScreenshot(WebElement element,String fileName){
		File srcFile =	((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./target/screenshots/"+fileName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
