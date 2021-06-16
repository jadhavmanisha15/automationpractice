package com.automation.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.base.Testbase;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;

public class LoginTestCases extends Testbase{
	public static HomePage homePage;
	public static LoginPage loginPage;
	
	@Test
	public void callInitialization()
	{
		homePage=initialization();
	}
	
	@Test
	public void signInButtonTest()
	{
		loginPage=homePage.clickOnSigninButton();
	}
	
	@Test(dataProvider="mydataprovider")
	public void signInTest(String username,String password)
	{
		loginPage.signIn(username,password);
	}
	
	@DataProvider(name="mydataprovider")
	public Object[][] myData()
	{
		return new Object[][] {{"aniketmorerajegaonkar@gmail.com","AniketAniket"}};
	}
	
	
	
	
	
	
}
