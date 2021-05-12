package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLoginHashMaoExample {

	public static void main(String[] args) {
//		Map<String ,String > userMap = new HashMap<String , String>();
//		userMap.put("admin", "admin_admin@1234");
//		userMap.put("manager", "manager1_test@1234");
//		userMap.put("senior associate", "er1_test12345");
//		userMap.put("tester", "tester1_test12345");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.name("username")).sendKeys(userMap.get("tester").split("_")[0]);
//		driver.findElement(By.name("password")).sendKeys(userMap.get("tester").split("_")[1]);
		doLogin(driver, getUserMap(), "manager");
		
	}
	public static Map<String ,String > getUserMap() {
		Map<String ,String > userMap = new HashMap<String , String>();
		userMap.put("admin", "admin_admin@1234");
		userMap.put("manager", "manager1_test@1234");
		userMap.put("senior associate", "er1_test12345");
		userMap.put("tester", "tester1_test12345");
		return userMap;
	}
	public static void doLogin(WebDriver driver , Map<String ,String > userMap , String userKey) {
		driver.findElement(By.name("username")).sendKeys(userMap.get(userKey).split("_")[0]);
		driver.findElement(By.name("password")).sendKeys(userMap.get(userKey).split("_")[1]);
	}
	

}
