package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemsPage {
	public WebDriver driver;
	public ItemsPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement womensTab;
	
	@FindBy(xpath="(//a[@title='Casual Dresses'])[1]")
	private WebElement causualDressLink;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomensTab() {
		return womensTab;
	}

	public WebElement getCausualDressLink() {
		return causualDressLink;
	}
	
	@FindBy(id="search_query_top")
	private WebElement searchField;
	public WebElement getSearchField() {
		return searchField;
	}
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement enterBtn;
	public WebElement getEnterBtn() {
		return enterBtn;
	}
	
}
