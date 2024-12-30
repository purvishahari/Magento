package org.stepdefinition;

import org.junit.Assert;
import org.pompage.LogoutPage;
import org.pompage.RegisterPage;
import org.utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps extends BaseClass {
	
	RegisterPage r;
	LogoutPage o;
	
	@Given("The user should be in homepage of application")
	public void the_user_should_be_in_homepage_of_application() {
		
	}
	
	@When("The user should click the create an account button")
	public void the_user_should_click_the_create_an_account_button() {
		r=new RegisterPage();
		click(r.getCreateBtn());
		Assert.assertTrue("verify the customer create account page", currentUrl().contains("customer/account/create/"));
	}
	
	@When("The user should enter the required details of it")
	public void the_user_should_enter_the_required_details_of_it() {
	    sendkeys(r.getFirstName(), getPropertyValue("firstname"));
	    sendkeys(r.getLastName(), getPropertyValue("lastname"));
	    sendkeys(r.getEmail(), getPropertyValue("email"));
	    sendkeys(r.getPassword(), getPropertyValue("password"));
	    sendkeys(r.getConfirmPassword(), getPropertyValue("confirmpassword"));
		click(r.getCreateAccountBtn());
	}
	
	@Then("The user should verify the page after create an account")
	public void the_user_should_verify_the_page_after_create_an_account() {
		
		Assert.assertEquals("verify the registration page", "Thank you for registering with Main Website Store.", getText(r.getVerifyCreatePage()));
		o=new LogoutPage();
		click(o.getLogoutBtnArrow());
		click(o.getSignOutBtn());
		
	}

}
