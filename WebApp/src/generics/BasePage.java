package generics;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver;
	
	public  BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	
	public void verifyTitle(String eTitle)//
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		try{
		wait.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("title is matching" +eTitle,true);
		}
		catch(Exception e)
		{
			Reporter.log("title is not matching" +eTitle,true);	
			Assert.fail();
		}
	}
	public void ElementIsPresent(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try{
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("element is matching" +element,true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not matching" +element,true);	
			Assert.fail();
		}
	}
}
