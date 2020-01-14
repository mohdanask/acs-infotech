package com.acs.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{

	@FindBy(xpath="//div[@class='main-title']/h1")
	private WebElement homePgeTxt;
	
	@FindBy(xpath="//a[contains(text(),'Masters')]")
	private WebElement masterLink;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement getHomePgeTxt() {
		return homePgeTxt;
	}

	public WebElement getMasterLink() {
		return masterLink;
	}
	
}
