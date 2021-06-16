package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Testbase;

public class AccountPage extends Testbase {
	public static Actions action=new Actions(driver);
	
	public AccountPage() 
	{
		PageFactory.initElements(driver, AccountPage.class);
	}
	
	@FindBy(css="a[title='Women']")
	WebElement womenEle;
	
	@FindBy(css="a[title='Evening Dresses']")
	WebElement ele;
	
	
	public void moveOnWomenOption()
	{
		action.moveToElement(womenEle).build().perform();
	}
	
	public EveningDressesPage clickOnEveningdresses()
	{
		ele.click();
		return new EveningDressesPage();
	}

}
