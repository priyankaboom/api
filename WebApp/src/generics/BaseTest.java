package generics;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@Listeners(FWListener.class)
public abstract class BaseTest implements IAutoConst
{
	public WebDriver driver;
	String url=UtilityLib.getPropertyValue(CONFIG_Path, "URL");
	@BeforeSuite
	public void setDriverPath()
	{
		System.setProperty(CHROME_Key, CHROME_Value);
		System.setProperty(GECKO_Key, GECKO_Value);
	}
	//@Parameters({"node","browser"})
	@BeforeMethod(alwaysRun=true)
	public void openApp() throws MalformedURLException
	{
		//URL whichSystem=new URL(node);
		//DesiredCapabilities whichbrowser=new DesiredCapabilities();
		//whichbrowser.setBrowserName(browser);
		//driver=new RemoteWebDriver(whichSystem,whichbrowser);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String url=UtilityLib.getPropertyValue(CONFIG_Path, "URL");
		driver.get(url);
	}
	@AfterMethod
	public void closeApp()
	{
		
		
		driver.quit();
	}
}
