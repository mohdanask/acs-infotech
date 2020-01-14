package com.acs.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.acs.genric.BaseLib;
import com.acs.pageobject.ExecutiveMasterPage;

public class ExecutiveMasterFeature extends BaseLib
{
	WebDriver driver;
	ExecutiveMasterPage emp;

	public ExecutiveMasterFeature(WebDriver driver)
	{
		this.driver=driver;
		emp=new ExecutiveMasterPage(driver);
	}
	
	
	public void creExecutiveMaster(String name,String code, String email, String password,String mobile,String phone,String depTxt )
	{
		emp.getExecNme().sendKeys(name);
		emp.getExecCode().sendKeys(code);
		emp.getExecEmail().sendKeys(email);
		emp.getPasswrd().sendKeys(password);
		emp.getMobile().sendKeys(mobile);
		emp.getPhone().sendKeys(phone);
		WebElement depDrpDwn = emp.getDepartDrpDwn();
		depDrpDwn.click();
		Select st= new Select(depDrpDwn);
		st.selectByVisibleText(depTxt);
		emp.getBtn().click();
		
	}
}
