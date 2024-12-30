package org.pompage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class RegisterPage extends BaseClass {
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[text()='Create an Account'])[1]")
	private WebElement createBtn;
	
	@FindBy(id = "firstname")
	private WebElement firstName;
	
	@FindBy(id = "lastname")
	private WebElement lastName;
	
	@FindBy(id = "email_address")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "password-confirmation")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "(//span[text()='Create an Account'])[1]")
	private WebElement createAccountBtn;
	
	@FindBy(xpath = "//div[text()='Thank you for registering with Main Website Store.']")
	private WebElement verifyCreatePage;
	
	public WebElement getCreateBtn() {
		return createBtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getCreateAccountBtn() {
		return createAccountBtn;
	}
	
	public WebElement getVerifyCreatePage() {
		return verifyCreatePage;
	}

	
}
