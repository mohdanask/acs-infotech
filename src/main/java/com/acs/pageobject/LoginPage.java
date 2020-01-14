package com.acs.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	@FindBy(id="username")
	private WebElement emailid;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement btn;
	
	@FindBy(xpath="(//div[@class='myerror']/span)[1]")
	private WebElement errMsg;
	
	
	   
 

public LoginPage(WebDriver driver) 
   {
	PageFactory.initElements(driver, this);
   }

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getBtn() {
		return btn;
	}

	 public WebElement getErrMsg() {
			return errMsg;
		}
	
}
