package com.projeectName.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.projectName.qa.pages.HomePage;
import com.projectName.qa.pages.LoginPage;
import com.projeectname.qa.base.TestBase;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority = 0)
	public void loginPageTitleTest() {
		String actualTitle = loginPage.validateLoginPageTitle();
		Assert.assertEquals(actualTitle, "Cogmento CRM");
	}
	
	@Test(priority = 1)
	public void loginTest() throws InterruptedException {
		homePage = loginPage.login(props.getProperty("username"), props.getProperty("password"));
		Assert.assertEquals(homePage.verifyHomePage(), true);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
