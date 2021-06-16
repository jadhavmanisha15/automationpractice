package com.automation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Testbase;

public class EveningDressesPage extends Testbase 
{
	Actions action=new Actions(driver);
	public EveningDressesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input#layered_id_attribute_group_2")
	WebElement sizeMEle;
	
	@FindBy(css="input#layered_id_attribute_group_24")
	WebElement colorPinkEle;
	
	@FindBy(xpath="//a[@class='ui-slider-handle ui-state-default ui-corner-all'][1]")
	WebElement rangebarLeft;
	
	@FindBy(css="a[class='ui-slider-handle ui-state-default ui-corner-all ui-state-hover']")
	WebElement rangebarRight;
	
	@FindBy(css="img[title='Printed Dress']")
	WebElement imgEle;
	
	@FindBy(css="a[class='button lnk_view btn btn-default']")
	WebElement clickOnMoreEle;
	
	
	
	
	
	
	public void clickOnMChechbox()
	{
	 sizeMEle.click();
	}
	
	public void clickOnColorPinkCheckBox()
	{
		colorPinkEle.click();
	}
	
	
	
	public void handleRangeBar()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", rangebarLeft);
		js.executeScript("arguments[0].setAttribute('style','left: 38%');", rangebarLeft);
		js.executeScript("arguments[0].style.color='red';",rangebarLeft);
		
		
	}
	
	public void moveOnImage()
	{
		action.moveToElement(imgEle).build().perform();
	}
	
	public PrintedDressPage clickOnMoreBtn()
	{
		clickOnMoreEle.click();
		return new PrintedDressPage();
	}

}
