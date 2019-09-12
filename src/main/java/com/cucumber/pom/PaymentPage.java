package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	public WebDriver driver;
	public PaymentPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//span[contains(text(),'I confirm my order')]")
	private WebElement ConfirmOrder;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getConfirmOrder() {
		return ConfirmOrder;
	}
}
