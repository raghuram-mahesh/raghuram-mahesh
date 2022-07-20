package com.grid.base;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBase {

	WebDriver driver;
	DesiredCapabilities dc = new DesiredCapabilities();
	
	public WebDriver initialization(String brname) {
		
		if (brname.equals("chrome")) {
			dc.setBrowserName("chrome");
		}
			
		else if (brname.equals("edge")) {
			dc.setBrowserName("MicrosoftEdge");
		}
			
		else if(brname.equals("firefox"))
			dc.setBrowserName("firefox");
		try {
			driver= new RemoteWebDriver( new URL("http://localhost:4444"),dc);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
}
