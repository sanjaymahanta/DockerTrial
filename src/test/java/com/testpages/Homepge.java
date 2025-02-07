package com.testpages;

 
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pages.HomePage;


public class Homepge extends BaseClass {
HomePage hp ;


	@BeforeSuite
	public void setUp() throws Exception {
		initialization("chrome");
		hp = new HomePage(driver);
				
	}
	
	
	@Test
	public void TC_001() {
	hp.acceshomepge();
		
	}
}
