package com.grid.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.grid.base.TestBase;

public class GridTestexe2 extends TestBase{
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = initialization("edge");
	}

	
	@Test
	public void secondttestcase() {
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle()+"edge");
		
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}

}
