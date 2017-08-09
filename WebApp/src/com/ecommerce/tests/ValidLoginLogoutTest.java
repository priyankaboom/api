package com.ecommerce.tests;

import org.testng.annotations.Test;

import com.ecommerce.pages.ActiTimeEnterTimeTrack;
import com.ecommerce.pages.LoginPage;

import generics.BaseTest;
import generics.UtilityLib;

public class ValidLoginLogoutTest extends BaseTest
{
	@Test(priority=1,enabled=true)
	public void testValidLoginLogout() 
	{
		String un = UtilityLib.getCellValue(INPUT_Path,"testValidLoginLogout",1,0);
		String pw = UtilityLib.getCellValue(INPUT_Path,"testValidLoginLogout",1,1);
		String hometitle = UtilityLib.getCellValue(INPUT_Path,"testValidLoginLogout",1,2);
		String logintitle = UtilityLib.getCellValue(INPUT_Path,"testValidLoginLogout",1,3);
		LoginPage l=new LoginPage(driver);
		//enter valid login username
		l.username(un);
		//enter valid login password
		l.password(pw);
		//click on login
		l.clickLogin();
		
		ActiTimeEnterTimeTrack att=new ActiTimeEnterTimeTrack(driver);
		att.verifyTitle(hometitle);
		//click logout
		att.logout();
		//verify login page
		l.verifyTitle(logintitle);
	}

}