package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	public WebDriver driver;
	public OrderPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceedToCheckoutBtn1;
	
	@FindBy(xpath="(//span[contains(text(),'Proceed to checkout')])[2]")
	private WebElement proceedToCheckoutBtn2;
	
	@FindBy(xpath="//label[contains(text(),'I agree to the terms of service and will adhere to them unconditionally.')]")
	private WebElement radioBtn;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProceedToCheckoutBtn1() {
		return proceedToCheckoutBtn1;
	}

	public WebElement getProceedToCheckoutBtn2() {
		return proceedToCheckoutBtn2;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getProceedToCheckoutBtn3() {
		return proceedToCheckoutBtn3;
	}

	public WebElement getPayByBankLink() {
		return payByBankLink;
	}

	@FindBy(xpath="//button[@type='submit']//span[contains(text(),'Proceed to checkout')]")
	private WebElement proceedToCheckoutBtn3;
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement payByBankLink;
	
	

}
