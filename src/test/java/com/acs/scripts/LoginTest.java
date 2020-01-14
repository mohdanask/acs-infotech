package com.acs.scripts;

import org.testng.annotations.Test;

import com.acs.features.LoginFeature;
import com.acs.genric.BaseLib;
import com.acs.genric.ExcelUtilities;

public class LoginTest extends BaseLib
{
  @Test(priority=1)
  public void verifyValidLogin() 
  {
	 ExcelUtilities eu = new ExcelUtilities("./testdata/acsData.xlsx"); 
	 String email = eu.readData("Sheet1",1 , 1);
	String password = eu.readData("Sheet1", 2, 1);
	LoginFeature lf = new LoginFeature(driver);
	lf.login(email, password);
	lf.verifyValidLogin();
  }
  
  @Test(priority=2)
  public void verifyInvalidLogin()
  {
	  ExcelUtilities eu = new ExcelUtilities("./testdata/acsData.xlsx"); 
		 String email = eu.readData("Sheet1",1 , 1);
		String password = eu.readData("Sheet1", 2, 2);
		LoginFeature lf = new LoginFeature(driver);
		lf.login(email, password);
		lf.verifyInvalidLogin();
  }
}
