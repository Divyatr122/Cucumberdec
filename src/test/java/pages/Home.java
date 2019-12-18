package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	WebDriver driver;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="SignIn")
	public static WebElement signin;
	
	@FindBy(linkText="userName")
	public static WebElement userName;
	
	@FindBy(linkText="password")
	public static WebElement password;
	
	@FindBy(linkText="Login")
	public static WebElement Login;

}
