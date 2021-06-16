package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.base.Testbase;

public class PrintedDressPage extends Testbase {
	
    public static Select select;
    
	@FindBy(css="input#quantity_wanted")
	WebElement quantityTextbox;
	
	@FindBy(css="select#group_1")
	WebElement sizeMDrd;
	
	@FindBy(css="a#color_")
	WebElement colorCheckBox1;
	
	@FindBy(css="a#color_7") 
	WebElement colorCheckBox2;
	
	@FindBy(css="button[name='Submit']")
	WebElement addToCartButton;
	
	@FindBy(css="span#layer_cart_product_title")
	WebElement checkTitle;
	
	
	public PrintedDressPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterQuantity()
	
	{
		quantityTextbox.clear();
		quantityTextbox.sendKeys("3");
	}
	
	public void selectSizeDrpOption()
	{
		select=new Select(sizeMDrd);
		select.selectByValue("2");
		
	}
	
	public void selectColorCheckBox1()
	{
		colorCheckBox1.click();
	}
	
	public void selectColorCheckBox2()
	{
		colorCheckBox2.click();
		colorCheckBox1.click();
	}
	
	public void clickOnAddCartButton()
	{
	  addToCartButton.click();
	}
	
	public void checkTitleMethod()
	{
		String labelText=checkTitle.getText();
		System.out.println(labelText);
	}
	
	
	
	

}
