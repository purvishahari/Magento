package org.pompage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LogoutPage extends BaseClass {
	
	public LogoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[@type='button'])[1]")
	private WebElement logoutBtnArrow;
	
	@FindBy(xpath = "(//a[contains(text(),'Sign Out')])[1]")
	private WebElement signOutBtn;
	
	@FindBy(xpath = "(//span[contains(text(),'Welcome,')])[1]")
	private WebElement usernameText;

	
	public WebElement getLogoutBtnArrow() {
		return logoutBtnArrow;
	}

	public WebElement getSignOutBtn() {
		return signOutBtn;
	}

	public WebElement getUsernameText() {
		return usernameText;
	}
	
}
