package com.acs.features;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.acs.genric.BaseLib;
import com.acs.pageobject.HomePage;

public class HomeFeature extends BaseLib
{
	WebDriver driver;
     HomePage hp;
	public HomeFeature(WebDriver driver)
	{
		this.driver = driver;
		hp= new HomePage(driver);
	}
	
	public void masterExecutiveClick()
	{
		Actions act = new Actions(driver);
		act.moveToElement(hp.getMasterLink()).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
	}
	
	
}
