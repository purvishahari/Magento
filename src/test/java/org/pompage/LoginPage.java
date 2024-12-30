package org.pompage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
	private WebElement signInBtnFirst;
	
	@FindBy(id = "email")
	private WebElement usernameLogin;
	
	@FindBy(id = "pass")
	private WebElement passwordLogin;
	
	@FindBy(id = "send2")
	private WebElement signInBtnSecond;

	
	public WebElement getSignInBtnFirst() {
		return signInBtnFirst;
	}

	public WebElement getUsernameLogin() {
		return usernameLogin;
	}

	public WebElement getPasswordLogin() {
		return passwordLogin;
	}

	public WebElement getSignInBtnSecond() {
		return signInBtnSecond;
	}

}
