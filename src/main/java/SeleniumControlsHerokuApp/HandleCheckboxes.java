package SeleniumControlsHerokuApp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckboxes {
  private static By headerText = By.xpath("//h1[contains(text(),'Welcome to the-internet')]");
  private static By checkboxLink = By.linkText("Checkboxes");
  private static By header =By.xpath("//h3[contains(text(),'Checkboxes')]");
  private static By checkboxForm = By.xpath("//input[@type='checkbox']");
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(headerText));
        driver.findElement(checkboxLink).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(header));
       int numberOfCheckboxes = driver.findElements(checkboxForm).size();
       
       for(int i =0;i<=numberOfCheckboxes-1;i++) { 
    	   List<WebElement>allOptions = driver.findElements(checkboxForm);
    	   String check_state= allOptions.get(i).getAttribute("checked");
           if(check_state == null){
               System.out.println("Checbox "+(i+1)+" is not selected");
               allOptions.get(i).click();
               System.out.println("Checbox "+(i+1)+" is now selected");
               break;
           }
    	    
       }
        
       driver.quit();  
	}

}
