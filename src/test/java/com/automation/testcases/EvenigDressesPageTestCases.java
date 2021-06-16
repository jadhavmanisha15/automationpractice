package com.automation.testcases;

import org.testng.annotations.Test;

import com.automation.base.Testbase;
import com.automation.pages.AccountPage;
import com.automation.pages.EveningDressesPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;

public class EvenigDressesPageTestCases extends Testbase {

	public static HomePage homePage;
	public static LoginPage loginPage;
	public static AccountPage accountPage;
	public static EveningDressesPage eveningDressesPage;
	
	@Test(dataProvider="mydataprovider",dataProviderClass=LoginTestCases.class)
	public void cliockOnMChechBoxTest(String username, String pass)
	{
		homePage=initialization();
		loginPage=homePage.clickOnSigninButton();
        accountPage=loginPage.signIn(username, pass);
    	accountPage.moveOnWomenOption();
    	eveningDressesPage=accountPage.clickOnEveningdresses();
	    eveningDressesPage.clickOnMChechbox();
	    eveningDressesPage.clickOnColorPinkCheckBox();
	    eveningDressesPage.handleRangeBar();
	    eveningDressesPage.moveOnImage();
	    eveningDressesPage.clickOnMoreBtn();
	}

	
}

