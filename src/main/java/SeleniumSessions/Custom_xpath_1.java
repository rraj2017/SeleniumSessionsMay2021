package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_xpath_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//1.xpath with single property
		//htmltag[@prop1='value']
		
		//input[@id='username']
		
		//2.xpath with multiple property
		//htmltag[@prop1='value' and @prop2='value']
		//input[@id='username' and @type='email']
		
		//3.xpath using class attribute
		//input[@class='form-control private-form__control login-email']
		
		//4.contains in xpath:
		//htmltag[contains(@prop,'value')]
		//input[contains(@class,'login-email')]
		
		
		//input[@id='username' and contains(@class,'login-email')]
		//input[@id='username' and contains(@class,'')]
		
		//5.contains used for dynamic id's:
//		<input id ='test_123'>
//		<input id ='test_233'>
//		<input id ='test_211'>
//		<input id ='test_543'>
		//input[contains(@id,'test_')]
		
		//6.xpath using index:
		
		//(//input[contains(@class,'form-control')])[1]
		//(//input[contains(@class,'form-control')])[2]
		
		//7.xpath using position:
		
		//(//input[contains(@class,'form-control')])[position()=1]
		//(//input[contains(@class,'form-control')])[position()=2]
		
		//8.xpath using last:
		//(//input[contains(@class,'form-control')])[last()]
		
		//9.xpath in text():
		
		//htmltag[text()='textvalue']
		//10.xpath with text() using contains
		//htmltag[contains(text(),'value')]
		
		//11. xpath with starts-with:
		//htmltag[starts-with(@attribute ,'startingvalue')]
		//htmltag[starts-with(text(),'value')]
		
	}

}
