package com.ecommerce.tests;

import org.testng.annotations.Test;

import com.ecommerce.pages.ActiTimeEnterTimeTrack;
import com.ecommerce.pages.LoginPage;

import generics.BaseTest;
import generics.UtilityLib;

public class InvalidLoginLogout extends BaseTest
{
	@Test
	public void testInvalidLoginLogout()
	{
		int rc=2;
		for(int i=1;i<=rc;i++)
		{
				
		String un = UtilityLib.getCellValue(INPUT_Path,"testInvalidLoginLogout",i,0);
		String pw = UtilityLib.getCellValue(INPUT_Path,"testInvalidLoginLogout",i,1);
		
		LoginPage lp=new LoginPage(driver);
		//enter invalid username
		lp.username(un);
		//enter invalid password
		lp.password(pw);
		//click login.
		lp.clickLogin();
		//verify errmsg
		lp.verifyerrmsg();
		}
	}
}