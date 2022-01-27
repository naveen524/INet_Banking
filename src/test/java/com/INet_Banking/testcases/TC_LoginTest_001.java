package com.INet_Banking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.INet_Banking.pageobjectmodel.Login_Page;

public class TC_LoginTest_001 extends BaseClass {
	@Test	
	public void login_Test()
	{
		logger.info("URL is opened");
		Login_Page lp = new Login_Page(driver);
		lp.setUserName(username);
		logger.info("username entered");
		lp.setPassword(password);
		logger.info("password entered");
		lp.ClickSubmit();
		logger.info("hits on login");
		if(driver.getTitle().equals("Welcome To Manager's Page of Guru99 Bank"))
		{
			Assert.assertTrue(true);
			logger.info("login test passed");
		}
		else
		{
			Assert.assertFalse(false);
			logger.info("login test fails");
		}	
	}
}
