package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct 
{

@Given("user is in login page")
public void user_is_in_login() {
   
	
	System.out.println("In Login page");
}

@When("user enter valid username and password")
public void user_enter_valid_username_and_password() 
{
  System.out.println("User entered valid username and password");
}

@When("^click on ok$")
public void click_on_ok() 
{
  System.out.println("Click on submit buttton");   
}

@Then("should be able to login into application")
public void should_be_able_to_login_into_application() {
    System.out.println("User has been login into application successfully");
}

@Given("user is on login")
public void user_is_on_login() {
	
	System.out.println("In Login page");
    
}

@When("user enter valid username and invalid password")
public void user_enter_valid_username_and_invalid_password() {
	 System.out.println("User entered valid username and invalid password");
}

@Then("error message should be displayed")
public void error_message_should_be_displayed() {

	 System.out.println("Error message should be displayed");
}

}
