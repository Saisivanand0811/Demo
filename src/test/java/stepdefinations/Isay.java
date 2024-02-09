package stepdefinations;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Isay
{
	WebDriver driver;
	
	@Given("^i was in isay login page$")
	public void i_was_in_isay_login_page()
	{
		driver= new ChromeDriver();
		driver.get("https://www.ipsosisay.com/en-in/user/login");
		
		
	}

	@When ("^i entered valid username and password$")
	public void i_entered_valid_username_and_password(DataTable data)
	{
		
		Map<String,String> input = data.asMap(String.class , String.class);
		
		driver.findElement(By.id("edit-name")).sendKeys(input.get("Email"));
		
		driver.findElement(By.id("edit-pass")).sendKeys(input.get("Password"));;
		
	}
   
@And ("^i click on login button$")
    
    public void i_click_on_login_button()
    {
	
	driver.findElement(By.id("edit-submit")).click();
    	
    }
@Then ("^should be display isay homepage$")
public void should_be_display_isay_homepage()
{

	
	String actualtitle = driver.getTitle();
	String title = "https://www.ipsosisay.com/en-in/surveys?check_logged_in=1";

	Assert.assertEquals(title, actualtitle, "title Mismatched");
}
}
