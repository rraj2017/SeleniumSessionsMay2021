package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ESPNExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/england-tour-of-india-2020-21-1243364/india-vs-england-1st-test-1243384/full-scorecard");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> batsMenList = driver.findElements(By.xpath("//table[@class='table batsman']//tbody"));
         System.out.print(batsMenList);
//         for(int i =0; i<batsMenList.size();i++) {
//        	 System.out.println();
//        	 getPlayerScoreCard(driver, batsMenList.get(i).getText());
//        	 
//         }
	}
	public static void getPlayerScoreCard(WebDriver driver , String playerName) {
		List<WebElement> playerScoreInfoList = driver.findElements(By.xpath("//a[contains(text()'" +playerName+"')]//parent::td//following-sibling::td[@class='text-left']"));
		if(playerName.length()<=8) {
			System.out.print(playerName + "\t" + "\t");
		}
		else {
			System.out.print(playerName + "\t");
		}
		for(int i =0;i<playerScoreInfoList.size();i++) {
			System.out.print(playerScoreInfoList.get(i).getText() + "\t");
			
		}
	}

}
