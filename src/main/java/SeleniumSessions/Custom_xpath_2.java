package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_xpath_2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//xpath Axes:
		
		//1.xpath for traversing from child to parent :(jumping from child to parent)
		 //input[@name='username']//parent::div
		
		//2.xpath using following to find the immediate child from parent
	//	(//div[@class='input-group']//following::input)[1]
		//div[@class='input-group']//following::input[@name='username']	
		
		//3.xpath using preceding :
		//input[@name='username']//preceding::div
		
		//4.xpath to jump from parent to child:
		//div[@class='input-group']//child::input[@name='username']
		
		//span[text()='naveen k']//ancestor::td//preceding-sibling::td//input
		
		//a[contains(text(),'Harry')]//parent::td//preceding-sibling::td/input[@name='contact_id']
        
		//Reversing xpath: traversing from child to parent --->grand parent --->super parent-->top parent in DOM
		//input[@id='username']/../../../../../../../../../..
		//input[@id='username']/../../../../.. -- till form id
		//get the form attribute
		driver.findElement(By.xpath("//input[@id='username']/../../../../..")).getAttribute("id");
		
	}
	
	public static void selectContact(Actions action , WebDriver driver , String contactName) {
		action.click(driver.findElement(By.xpath("//span[text()='"+contactName+"']//ancestor::td//preceding-sibling::td//span[@class='']")))
		.build()
		.perform();
	}

}
