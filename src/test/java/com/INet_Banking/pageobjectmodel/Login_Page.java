package com.INet_Banking.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Page {
	WebDriver idriver;
	public Login_Page(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="uid")
	WebElement txtUserName;

	@FindBy(name="password")
	WebElement textPassword;

	@FindBy(name="btnLogin")
	WebElement txtLogin;

	public void setUserName(String username)
	{
		txtUserName.sendKeys(username);	
	}

	public void setPassword(String password)
	{
		textPassword.sendKeys(password);	
	}

	public void ClickSubmit()
	{
		txtLogin.click();	
	}


}
