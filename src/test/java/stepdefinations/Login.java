package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login
{
  
	@Given("user is on amazon homepage")
	public void user_is_on_amazon_homepage()
	{
		System.out.println("User is an amazon homepage");
	}
	@When("user select Electronics category")
	public void user_select_electronics_category() {
	    
	}

	@When("enter smartphone in search box")
	public void enter_smartphone_in_search_box() {
	    
	}

	@Then("proper realted smartphones should be displayed")
	public void proper_realted_smartphones_should_be_displayed() {
	   
	}

	@Then("do not disply any other items")
	public void do_not_disply_any_other_items() {

	}

	@When("user select books category")
	public void user_select_books_categerory() {
		
		System.out.println("Select book category");
	}

	@When("enter rich dad poor dad in search box")
	public void enter_rich_dad_poor_dad_in_search_box() {
	   System.out.println("Enter book name in search box");
	}

	@Then("proper book should be displayed")
	public void proper_book_should_be_displayed() {
	  
		System.out.println("Rich dad poor dad books should be displayed");
	}

	
}