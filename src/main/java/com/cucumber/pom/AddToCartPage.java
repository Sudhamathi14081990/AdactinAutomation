package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	public WebDriver driver;
	public AddToCartPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	private WebElement addToCartBtn;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}

	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	private WebElement proceedBtn;
	
	@FindBy(xpath="//img[@title='Printed Dress']")
	private WebElement image;
	
	public WebElement getImage() {
		return image;
	}
	@FindBy(xpath="(//h2)[1]")
	private WebElement textField;
	public WebElement getTextField() {
		return textField;
	}
	
	@FindBy(xpath="//div[@class='layer_cart_product col-xs-12 col-md-6']")
	private WebElement alertBox;
	public WebElement getAlertBox() {
		return alertBox;
	}
}
