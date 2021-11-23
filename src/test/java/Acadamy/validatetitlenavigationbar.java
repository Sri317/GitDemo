package Acadamy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;
import pageobject.Landingpage;
import pageobject.loginpage;



public class validatetitlenavigationbar extends base {
	public static Logger Log=LogManager.getLogger(base.class.getName());
	WebDriver driver;

	@BeforeTest
	public void intialize() throws IOException {
		driver=intializedata();
		driver.get(prop.getProperty("url"));
	}
	
	
	
	
	
	
	@Test
	public void basepagenavigation() throws IOException {
	
		Landingpage l=new Landingpage(driver);
		//l.getvisible().isDisplayed();
		Assert.assertTrue(l.getvisible().isDisplayed());
	Log.info("successfully validate");
	
		}
	@AfterTest
	public void Teardown() {
		driver.close();
	
		
	}
	
}
