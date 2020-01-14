package com.acs.scripts;

import org.testng.annotations.Test;

import com.acs.features.HomeFeature;
import com.acs.genric.BaseLib;

public class HomePageTest extends BaseLib{
  @Test
  public void executiveCreTest() 
  {
	  HomeFeature hf = new HomeFeature(driver);
	  hf.masterExecutiveClick();
	  
	  
  }
}
