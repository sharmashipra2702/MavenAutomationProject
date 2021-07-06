package com.projectName.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.projeectname.qa.base.TestBase;

public class LoginPage extends TestBase {
		
	// PageFactory - OR
	@FindBy(xpath = "//button[text()='Got It']")
	WebElement  gotItPopUp;
	
	@FindBy(xpath = "//span[text() = 'Log In']//parent::a")
	WebElement loginButtonOnMainPage;
	
	@FindBy(name = "email")
	WebElement emailId;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//div[text()='Login']")
	WebElement  loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		gotItPopUp.click();
		loginButtonOnMainPage.click();
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String email, String pass) {
		emailId.sendKeys("vishalmishra1104@gmail.com");
		password.sendKeys("test@123");
		loginButton.click();
		return new HomePage();
	}

}
