package generics;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import generics.UtilityLib;

public class FWListener implements ITestListener
{


	public void onTestStart(ITestResult result)
	{
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		// TODO Auto-generated method stub
		
	}
	public void onTestFailure(ITestResult result) {
		String name = UtilityLib.now();
		String path=IAutoConst.PHOTO_Path+name+".png";
		UtilityLib.getScreenShot(path);
		Reporter.log("photo is taken:"+path,true);
			
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
