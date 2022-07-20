package com.grid.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.grid.base.TestBase;

public class GridTestexe extends TestBase {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = initialization("chrome");
	}

	
	@Test
	public void firsttestcase() {
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle()+"chrome");
		
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	
	
	
}
