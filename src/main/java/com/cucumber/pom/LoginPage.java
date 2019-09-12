package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement emailField;
	
	@FindBy(id="passwd")
	private WebElement passwordBtn;
	
	@FindBy(xpath="//span[contains(text(),'Mathi N')]")
	private WebElement verifyText;
	
	public WebElement getVerifyText() {
		return verifyText;
	}

	@FindBy(xpath="//button[@id='SubmitLogin']/span")
	private WebElement submitBtn;
		
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPasswordBtn() {
		return passwordBtn;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	

}
