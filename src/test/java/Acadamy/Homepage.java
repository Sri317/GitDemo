package Acadamy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;
import pageobject.Landingpage;
import pageobject.loginpage;



public class Homepage extends base {
	public static Logger Log=LogManager.getLogger(base.class.getName());
WebDriver driver;
	@BeforeTest
	public void intialize() throws IOException {
		driver=intializedata();
		driver.get(prop.getProperty("url"));
		Log.info("driver intial");
	}
	@Test(dataProvider="getdata")
	public void basepagenavigation(String username,CharSequence[] password) throws IOException {
		//driver=intializedata();
	driver.get("http://qaclickacademy.com/");
		Landingpage l=new Landingpage(driver);
		l.getlogin().click();
		loginpage lp=new loginpage(driver);
		//lp.getemail().sendKeys("hello");
		//lp.getpassword().sendKeys("hi");
		lp.getemail().sendKeys(username);
		lp.getpassword().sendKeys(password);
     Log.info("sendkeys");
		lp.getlogin().click();
          }
	@AfterTest
	public void Teardown() {
		driver.close();
	
		
	}
@DataProvider
	public Object[][] getdata() {
	//rows stands for how many different datatypes should run
	//column stands for how many values for each test
		Object[][] data=new Object [2][2];
		//1st row
		data[0][0]="nonresticted";
		data[0][1]="123456";
		data[1][0]="restricted";
        data[1][1]="9899654";
		
		return data;
	}

}
