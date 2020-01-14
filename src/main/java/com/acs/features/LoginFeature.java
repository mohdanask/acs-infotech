package com.acs.features;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.acs.genric.BaseLib;
import com.acs.pageobject.HomePage;
import com.acs.pageobject.LoginPage;



public class LoginFeature extends BaseLib
{
	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	
	public LoginFeature(WebDriver driver) 
	{
		this.driver=driver;
		lp=new LoginPage(driver);
		hp=new HomePage(driver);
	}
	
	public void login(String email, String password)
	{
		lp.getEmailid().sendKeys(email);
		lp.getPwd().sendKeys(password);
		lp.getBtn().click();
	}
	
	public void verifyValidLogin()
	{
		String pgeTle = hp.getHomePgeTxt().getText();
		
		System.out.println(pgeTle);
		String expTle="\r\n" + 
				"                    Dashboard\r\n" + 
				"                    ";
		Assert.assertEquals(pgeTle, expTle);
		Reporter.log("login function verified with valid credential",true);
		
	}
	
	public void verifyInvalidLogin()
	{
		String errMsg = lp.getErrMsg().getText();
		System.out.println(errMsg);
		String expMsg="Wrong Password";
		Assert.assertEquals(errMsg, expMsg);
		Reporter.log("login function verified with invalid credential",true);
	}
}
