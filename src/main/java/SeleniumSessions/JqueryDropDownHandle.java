package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
/**
 * j-query drop-down handle
 * @param args
 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		 driver.findElement(By.id("justAnInputBox")).click();
	//	 selectChoiceValues(driver, "choice 6");
	//	selectChoiceValues(driver, "choice 2","choice 2 3","choice 6 2 3");
		selectChoiceValues(driver, "ALL");
		
		 

	}
	/**
	 * to select single value pass this :selectChoiceValues(driver, "choice 6");
	 * to select multiple limited values pass this :selectChoiceValues(driver, "choice 2","choice 2 3","choice 6 2 3");
	 * to select all the choices pass this :selectChoiceValues(driver, "ALL");
	 * @param driver
	 * @param value
	 */
	 public static void selectChoiceValues(WebDriver driver ,String... value) {
		 List<WebElement> choiceList= driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
		 if(!value[0].equalsIgnoreCase("ALL")) {
			 for(int i =0;i<choiceList.size();i++) {
				 System.out.println(choiceList.get(i).getText());
				 String text =choiceList.get(i).getText();
				 
				 for(int k=0;k<value.length;k++) {
					 if(text.equals(value[k])) {
						 choiceList.get(i).click();
						 break;
					 } 
				 }
				 
			 }
			  
		 }
		 //select all the values:
		 else {
			 try {
			 for(int all=0; all<choiceList.size();all++) {
				 choiceList.get(all).click();
			 }
			 } catch(Exception e) {
				 
			 }
		 }
 
		 }
		 
}
