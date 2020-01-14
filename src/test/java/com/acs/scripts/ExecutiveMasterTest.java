package com.acs.scripts;

import org.testng.annotations.Test;

import com.acs.features.ExecutiveMasterFeature;
import com.acs.features.HomeFeature;
import com.acs.features.LoginFeature;
import com.acs.genric.BaseLib;
import com.acs.genric.ExcelUtilities;

public class ExecutiveMasterTest extends BaseLib
{
  @Test(priority=1)
  public void verifyExecMstrCre() 
  {
	  ExcelUtilities eu = new ExcelUtilities("./testdata/acsData.xlsx");
	  String email1 = eu.readData("Sheet1",1 ,1 );
	  String pass1 = eu.readData("Sheet1", 2,1 );
	  LoginFeature lf = new LoginFeature(driver);
	  lf.login(email1, pass1);
	  String name = eu.readData("Sheet2", 0,1 );
	  String code = eu.readData("Sheet2", 1,1 );
	  String email = eu.readData("Sheet2", 2,1 );
	  String password = eu.readData("Sheet2", 3,1 );
	  String mobile = eu.readData("Sheet2", 4,1 );
	  String phone = eu.readData("Sheet2", 5,1 );
	  String depTxt = eu.readData("Sheet2", 6,1 );
	  HomeFeature hf = new HomeFeature(driver);
	  hf.masterExecutiveClick();
	  ExecutiveMasterFeature emf = new ExecutiveMasterFeature(driver);
	   emf.creExecutiveMaster(name, code, email, password, mobile, phone, depTxt);
	  
  }
}
