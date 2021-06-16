package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Testbase;

public class LoginPage extends Testbase {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(css="input#email")
	WebElement emailaddress;
	
	@FindBy(css="input#passwd")
	WebElement password;
	
	@FindBy(css="button#SubmitLogin")
	WebElement signinbtn;
	
	
	
		
	public AccountPage signIn(String username,String pass)
	{
		emailaddress.sendKeys(username);	
		password.sendKeys(pass);
		signinbtn.click();
		return new AccountPage();
		
	}
	

}
