package com.automation.testcases;

import org.testng.annotations.Test;

import com.automation.base.Testbase;
import com.automation.pages.HomePage;

public class HomePageTestCases extends Testbase 
{
	HomePage homePage;
	
	@Test
	public void signInButtonTest()
	{
		homePage=initialization();
		homePage.clickOnSigninButton();
	}
	
}
