package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement signInBtn;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement signOutBtn;
	public WebElement getSignOutBtn() {
		return signOutBtn;
	}
	
}
