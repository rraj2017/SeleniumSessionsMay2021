package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Create a method for find=Element utility
 * @author rituraj
 *
 */
public class Util {
	WebDriver driver;
	
	public Util(WebDriver driver) {
		this.driver=driver;
	}
	/**
	 * This method is used to create the WebElement on the basis of By locator
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator) {
		WebElement element=null;
		try {
		 element =driver.findElement(locator);
		 JavaScriptUtil.flash(element, driver);
		}
		catch(Exception e) {
			System.out.println("Some exception occured while creating the webelement");
			System.out.println(e.getMessage());
		}
		return element;
	}
	/**
	 * This method is used to click on an element
	 * @param locator
	 */
	public void doClick(By locator) {
		try {
		getElement(locator).click();
		}
		catch(Exception e) {
			System.out.println("Some exception occured while clicking on the webelement..");
			System.out.println(e.getMessage());
		}
	}
	/**
	 * This method is used to pass the values in a webelement
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator,String value) {
		try {
		getElement(locator).sendKeys(value);
		}
		catch(Exception e) {
			System.out.println("Some exception occured while passing value to the webelement..");
			System.out.println(e.getMessage());
		}
	}
//	public void waitForElementPresent(By locator,int timeOut) {
//		WebDriverWait wait = new WebDriverWait(driver ,timeOut);
//		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//	}
	public void doActionsSendKeys(By locator , String value) {
		Actions action = new Actions(driver);
		WebElement element = getElement(locator);
		action.sendKeys(element, value).perform();
	}
	public void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		WebElement element = getElement(locator);
		action.click(element).perform();
	}
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	//wait custom methods:wait utils:
	
	public WebElement waitForElementToBePresent(By locator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver ,timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return getElement(locator);
	}
	public WebElement waitForElementToBeClickable(By locator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver ,timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return getElement(locator);
	}
	
	public WebElement waitForElementToBeVisible(By locator , int timeOut) {
		WebElement element = getElement(locator);
		WebDriverWait wait = new WebDriverWait(driver ,timeOut);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	public WebElement waitForElementVisibilityLocated(By locator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver ,timeOut);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return getElement(locator);
	}
	public String waitForUrl(String url , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver ,timeOut);
		wait.until(ExpectedConditions.urlContains(url));
		return driver.getCurrentUrl();
	}
	
	public String waitForTitlePresent(String title,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver ,timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	public boolean waitAlertToBePresent(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver ,timeOut);
		wait.until(ExpectedConditions.alertIsPresent());
		return true;
	}
	public void clickWhenReady(By locator , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver ,timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		getElement(locator).click();
	}
	public void visibilityOfAllElements(List<WebElement> elements , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver ,timeOut);
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}
	public static WebElement getElementWithExplicitWait(WebDriver driver , int timeOut , By locator) {
		WebDriverWait wait = new WebDriverWait(driver ,timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
