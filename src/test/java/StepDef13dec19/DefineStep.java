package StepDef13dec19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Home;

public class DefineStep {
	WebDriver driver;
	
	//public void openBrowser()
	
		
	
	
	@Given("I have chosen to sign up")
	public void i_have_chosen_to_sign_up() {
		System.setProperty("webdriver.chrome.driver","C://webdriver//chromedriver.exe");
		 driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");	
		driver.findElement(By.linkText("REGISTER")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("I sign up with valid deails")
	public void i_sign_up_with_valid_deails() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("I should receive a confirmation email")
	public void i_should_receive_a_confirmation_email() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("I should see a personalized greeting message")
	public void i_should_see_a_personalized_greeting_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@Given("Navigate to Home Page")
	public void navigate_to_Home_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b3a.00.35\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		Home.signin.click();
		Home.userName.sendKeys("mercury");
		Home.password.sendKeys("mercury");
		Home.Login.click();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User logged in successfull")
	public void user_logged_in_successfull() {
		System.out.println("login successfull");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
