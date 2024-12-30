package org.stepdefinition;

import org.junit.Assert;
import org.pompage.LoginPage;
import org.pompage.LogoutPage;
import org.utility.BaseClass;

import io.cucumber.java.en.*;

public class LoginSteps extends BaseClass {
	
	LoginPage l;
	LogoutPage o;	
	
	@When("The user should click the signIn button")
	public void the_user_should_click_the_sign_in_button() {
	   l=new LoginPage();
	   click(l.getSignInBtnFirst());
	   Assert.assertTrue("verify the login page", currentUrl().contains("customer/account/login"));
	}
	
	@Then("The user should enter the details of username and password")
	public void the_user_should_enter_the_details_of_username_and_password() {
	    sendkeys(l.getUsernameLogin(), getPropertyValue("email"));
	    sendkeys(l.getPasswordLogin(), getPropertyValue("password"));
		click(l.getSignInBtnSecond());
	}
	
	@Then("The user should verify the signIn page")
	public void the_user_should_verify_the_sign_in_page() {
				
	    o=new LogoutPage();
	    Assert.assertTrue("verify the signIn page", getText(o.getUsernameText()).contains("Welcome"));
	    
		click(o.getLogoutBtnArrow());
		click(o.getSignOutBtn());
		
	}
	
}
