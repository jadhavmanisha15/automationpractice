package com.automation.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.base.Testbase;
import com.automation.pages.AccountPage;
import com.automation.pages.EveningDressesPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.PrintedDressPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class PrintedDressPageTestCases extends Testbase {
	public static HomePage homePage;
	public static LoginPage loginPage;
	public static AccountPage accountPage;
	public static EveningDressesPage eveningDressesPage;
	public static PrintedDressPage printedDressPage;
	public static ExtentReports report;
	public static ExtentTest test=null;
	public static ITestResult result=null;

	@BeforeTest
	public void createReport()
	{
		if(report==null)
		{
			report=new ExtentReports("D:\\manisha\\automationpractice\\automationpractice.html", true);
		}
	}

	@BeforeMethod
	public void startTest(ITestResult result)
	{
		if(test==null)
		{
			test=report.startTest(result.getMethod().getMethodName());
		}
	}


	@Test(priority=0,dataProvider="mydataprovider",dataProviderClass=LoginTestCases.class)
	public void enterQuantityTest(String username, String pass)
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
		printedDressPage=eveningDressesPage.clickOnMoreBtn();
		printedDressPage.enterQuantity();
		printedDressPage.selectSizeDrpOption();
		printedDressPage.selectColorCheckBox1();
	}

	@Test(priority=1,invocationCount=50)
	public void run() throws InterruptedException
	{
		printedDressPage.selectColorCheckBox1();	
		Thread.sleep(100);
	    printedDressPage.selectColorCheckBox2();
		Thread.sleep(100);
	}
	 
	@Test(priority=2)
	public void run1()
	{
		printedDressPage.clickOnAddCartButton();
		printedDressPage.checkTitleMethod();
		driver.close();
	}


	@AfterMethod
	public void getMethodStatus(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.SUCCESS)	
		{
			test.log(LogStatus.PASS, "test case passed");
		}
		else 
		{
			test.log(LogStatus.FAIL, "test case failled");
			Testbase.Failled();
		}
		report.endTest(test);
		test=null;
	}

	@AfterTest
	public void closeReport()
	{
		report.flush();
		report.close();
		report=null;
	}

}





