package com.acs.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExecutiveMasterPage 
{

	@FindBy(xpath="//input[@placeholder='Executive Name']")
	private WebElement execNme;
	
	@FindBy(xpath="//input[@placeholder='//input[@placeholder='Executive Code']']")
	private WebElement execCode;
	
	@FindBy(name="email")
	private WebElement execEmail;
	
	@FindBy(name="Password")
	private WebElement Passwrd;
	
	@FindBy(name="Mobile")
	private WebElement mobile;
	
	@FindBy(name="Phone")
	private WebElement phone;
	
	@FindBy(name="ddlDepartment")
	private WebElement departDrpDwn;
	
	@FindBy(id="btnSubmit")
	private WebElement btn;
	


public ExecutiveMasterPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}



public WebElement getExecNme() {
	return execNme;
}



public WebElement getExecCode() {
	return execCode;
}



public WebElement getExecEmail() {
	return execEmail;
}



public WebElement getPasswrd() {
	return Passwrd;
}



public WebElement getMobile() {
	return mobile;
}



public WebElement getPhone() {
	return phone;
}



public WebElement getDepartDrpDwn() {
	return departDrpDwn;
}



public WebElement getBtn() {
	return btn;
}




}