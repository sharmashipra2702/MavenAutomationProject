package com.projectName.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.projeectname.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//i[@class='home icon']")
	WebElement homeIcon;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyHomePage() {
		return homeIcon.isDisplayed();
	}
}
