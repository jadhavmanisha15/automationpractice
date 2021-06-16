package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Testbase;

public class HomePage extends Testbase {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a[class='login']")
	WebElement signin;
	
	public LoginPage clickOnSigninButton()
	{
		signin.click();
		return new LoginPage();
	}

}
