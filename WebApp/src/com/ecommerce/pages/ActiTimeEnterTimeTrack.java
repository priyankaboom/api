package com.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.BasePage;

public class ActiTimeEnterTimeTrack extends BasePage
{

	@FindBy(id="logoutLink")
	private WebElement clicklogout;
	
	@FindBy(xpath="(//div[contains(text(),'Settings')])[1]")
	private WebElement clickSetting;
	
	@FindBy(linkText="Licenses")
	private WebElement clickLicenses;
	
	public ActiTimeEnterTimeTrack(WebDriver driver)
	{
		super(driver);	
	}

	public void logout()
	{
		try {
			Thread.sleep(4000);
			clicklogout.click();
		}
	 catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	public void Setting()
	{
		try {
			Thread.sleep(4000);
			clickSetting.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void licenses()
	{
		clickLicenses.click();
	}
}
