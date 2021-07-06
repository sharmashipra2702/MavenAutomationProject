package com.projectName.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.projeectname.qa.base.TestBase;

public class RegistrationPage extends TestBase {
	WebDriver driver;
	
	@FindBy(xpath = "//span[contains(text(), 'sign up')]/ancestor::a")
	WebElement signUp;
	
	@FindBy(id = "email")
	WebElement emailId;

	@FindBy(xpath = "//input[@class = 'search']")
	WebElement country;

	@FindBy(id = "phone_number")
	WebElement phoneNumber;
	
	@FindBy(id = "terms")
	WebElement termsAndConditions;
	
	@FindBy(id = "recaptcha-anchor")
	WebElement notRobot;
	
	@FindBy(xpath = "//button[@name = 'action']")
	WebElement registrationSignUp;
	
	public RegistrationPage(WebDriver driver) {
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	}
	
	public void register() {
		signUp.click();
		emailId.sendKeys("");
		country.sendKeys("");
		phoneNumber.sendKeys("");
		termsAndConditions.click();
		driver.switchTo().frame(notRobot);
		notRobot.click();
		registrationSignUp.click();
	}
}
