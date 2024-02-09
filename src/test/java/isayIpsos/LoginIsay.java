package isayIpsos;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginIsay 
{
	WebDriver driver;
	@Given("i was on isay login page")
	public void i_was_on_isay_login_page()
	{
	   driver = new ChromeDriver();	   
	   driver.get("https://www.ipsosisay.com/en-in/user/login"); 
	}
	
	
	@When("^i entered valid username as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
	public void i_entered_valid_username_as_username_and_password_as_password(String Username ,String Password)
	{
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.id("edit-name")).sendKeys(Username);
		  driver.findElement(By.id("edit-pass")).sendKeys(Password);
		  
		  System.out.println("Enter username as: "+Username+" and password as :"+Password);
	}
	
	
	@Then("i should be able to login into the application")
	public void i_should_be_able_to_login_into_the_application() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("edit-submit")).click();;
		System.out.println(driver.getTitle());
		
	}
	@And("close the browser")
	public void close_the_browser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
		System.out.println("Closing the browser");
	}
}
