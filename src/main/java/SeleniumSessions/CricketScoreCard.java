package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreCard {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/england-tour-of-india-2020-21-1243364/india-vs-england-1st-test-1243384/full-scorecard");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    ArrayList<String> stats =getBatsmanStats(driver ,"Joe Root");
	    System.out.println(stats);
		ArrayList<String> wicketTakerNamesList =getWicketTakerName(driver ,"Joe Root");
		System.out.println(wicketTakerNamesList);
		
	}
        public static ArrayList<String> getBatsmanStats(WebDriver driver , String batsmanName) {
        	
        	List<WebElement> scoreList =driver.findElements(By.xpath("//a[contains(text(),'" +batsmanName+"')]//parent::td//following-sibling::td"));
            System.out.println(scoreList.size());
            ArrayList<String>ar = new ArrayList<String>();
            for(int i =0;i<scoreList.size();i++) {
            	String text = scoreList.get(i).getText();
            	ar.add(text);
            }
            return ar;
        }
        public static ArrayList<String> getWicketTakerName(WebDriver driver, String batsmanName) {
        	List<WebElement> wicketTakerList =driver.findElements(By.xpath("//a[contains(text(),'" +batsmanName+"')]//parent::td//following-sibling::td[@class='text-left']"));
        	 ArrayList<String>ar = new ArrayList<String>();
        	for(int i =0;i<wicketTakerList.size();i++) {	
        		String wicketTakerName = wicketTakerList.get(i).getText();
        		ar.add(wicketTakerName);
        	}
        	return ar;
        }
        
        
        
	}



