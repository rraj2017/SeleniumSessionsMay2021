package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(priority=1)
	public void loginTest() {
		System.out.println("login test.....");
	}
	@Test(priority=2 , dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("home page test.....");
	}
	@Test(priority=2 , dependsOnMethods = {"loginTest","homePageTest"})
	public void searchTest() {
		System.out.println("search test.....");
	}

}
