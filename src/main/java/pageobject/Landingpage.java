package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	public WebDriver driver;
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector("[class='text-center'] h2");
	By navigate=By.cssSelector("[class='nav navbar-nav navbar-right']");

	public Landingpage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public WebElement getlogin() {
		 return driver.findElement(signin);
	}
	public WebElement gettitle() {
		 return driver.findElement(title);
	}
	public WebElement getvisible() {
		 return driver.findElement(navigate);
	}
}
