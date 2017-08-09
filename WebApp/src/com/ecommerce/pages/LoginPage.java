package com.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.BasePage;

public class LoginPage extends BasePage
{
	@FindBy(id="username")
	private WebElement untxb;
	
	@FindBy(name="pwd")
	private WebElement pwtxb;
	
	@FindBy(id="loginButton")
	private WebElement loginbtn;
	
	@FindBy(xpath="//span[contains(.,'Username or Password is invalid')]")
	private WebElement errmsg;
	
	@FindBy(xpath="//nobr[contains(text(),'actiTIME ')]")
	private WebElement actitimeversion ;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void username(String un)
	{
		untxb.sendKeys(un);
	}
	public void password(String pw)
	{
		pwtxb.sendKeys(pw);
	}
	public void clickLogin()
	{
		try {
		loginbtn.click();
		Thread.sleep(1000);
			
		} catch (InterruptedException e) {
		
		}
	}
	public void verifyerrmsg()
	{
	
		ElementIsPresent(errmsg);
	}
	public String getActitimeVersion()
	{
		return actitimeversion.getText();	
	}

}
