package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	public WebDriver driver;
	public ContactUsPage(WebDriver ldriver) {
		// TODO Auto-generated constructor stub
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Contact Us']")
	private WebElement ContactUsLink;
	
	@FindBy(id="id_contact")
	private WebElement HeadingDropDown;
	
	@FindBy(xpath="//option[@value='2']")
	private WebElement HeadingSelection;
	
	@FindBy(xpath="//select[@name='id_order']")
	private WebElement OrderDropDown;
	
	@FindBy(xpath="//option[@value='122652']")
	private WebElement OrderSelection;
	
	@FindBy(id="122652_order_products")
	private WebElement ProductDropDown;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getContactUsLink() {
		return ContactUsLink;
	}

	public WebElement getHeadingDropDown() {
		return HeadingDropDown;
	}

	public WebElement getHeadingSelection() {
		return HeadingSelection;
	}

	public WebElement getOrderDropDown() {
		return OrderDropDown;
	}

	public WebElement getOrderSelection() {
		return OrderSelection;
	}

	public WebElement getProductDropDown() {
		return ProductDropDown;
	}

	public WebElement getProductSelection() {
		return ProductSelection;
	}

	public WebElement getSendBtn() {
		return SendBtn;
	}

	public WebElement getTextArea() {
		return TextArea;
	}

	@FindBy(xpath="//div[@class='selector']//option[@value='3']")
	private WebElement ProductSelection;
	
	@FindBy(xpath="//span[contains(text(),'Send')]")
	private WebElement SendBtn;
	
	@FindBy(id="message")
	private WebElement TextArea;

}
