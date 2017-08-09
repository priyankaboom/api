package com.ecommerce.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.BasePage;

public class LicensesPage extends BasePage
{
	

	@FindBy(xpath="//nobr[text()='Product Edition:']/../../td[2]/b")
	private WebElement productEdition;
	
	public LicensesPage(WebDriver driver) 
	{
		super(driver);
	}
	public void version(String evalue)
	{
		String avalue = productEdition.getText();
		Assert.assertEquals(avalue,evalue);
		
	}

}
