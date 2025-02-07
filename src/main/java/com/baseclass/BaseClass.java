package com.baseclass;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {

	
	
	public WebDriver driver;
	public WebDriver initialization(String browserName) throws Exception {
		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		if(browserName.equals("chrome")) {
			dc.setBrowserName("chrome");
		}else if(browserName.equals("firefox")) {
			dc.setBrowserName("firefox");
		}else if(browserName.equals("edge")) {
			
		dc.setBrowserName("MicrosoftEdge");
		
	}
		
		driver = new  RemoteWebDriver(new URL("http://localhost:4444/"),dc);
		return driver;
	
}
	
}
