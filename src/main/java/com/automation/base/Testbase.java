package com.automation.base;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.pages.HomePage;

public class Testbase {
	public static WebDriver driver;
	
	public static HomePage initialization()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\manisha\\chromedriver1\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return new HomePage();
	}
	 static public void Failled() throws IOException
	{
		File Scrfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Scrfile, new File("D://manisha//screenshot//xyznn.png"));
		
	}
		
	

}
