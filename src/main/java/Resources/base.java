package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver intializedata() throws IOException {
		//Properties prop=new Properties();
		prop=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\eclips learning\\E2EProject\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		//mvn test -Dbrowser=chrome
		String browsername=System.getProperty("browser");
		//String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","c://mywork//chromedriver.exe");
			 driver=new ChromeDriver();
			}
		else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","c://mywork//geckodriver.exe");

			driver=new FirefoxDriver();
			}
		else if(browsername.equals("IE")) {
			
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		
	}

}
