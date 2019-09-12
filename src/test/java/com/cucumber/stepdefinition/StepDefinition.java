package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.BaseClass;
import com.cucumber.pom.HomePage;
import com.cucumber.pom.LoginPage;
import com.cucumber.testrunner.TestRunner;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass{
	public static WebDriver driver=TestRunner.driver;
	
	@Given("^user launch the AutomationPractice application$")
	public void user_launch_the_AutomationPractice_application() throws Throwable {
	   geturl("http://automationpractice.com/index.php");
	    
	}

	@When("^User click on the signin button in the header$")
	public void user_click_on_the_signin_button_in_the_header() throws Throwable {
		HomePage hp=new HomePage(driver);
		mouseHoverUsingActions(hp.getSignInBtn());
		clickOnElement(hp.getSignInBtn());
			    
	}

	@When("^User Enter email id in Signin Page$")
	public void user_Enter_email_id_in_Signin_Page() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		mouseHoverUsingActions(lp.getEmailField());
	    inputValuestoElement(lp.getEmailField(), "r.n.sudhamathi@gmail.com");
	    	    
	}

	@When("^User Enter Password in Signin page$")
	public void user_Enter_Password_in_Signin_page() throws Throwable {
		LoginPage lp1=new LoginPage(driver);
		mouseHoverUsingActions(lp1.getPasswordBtn());
	    inputValuestoElement(lp1.getPasswordBtn(), "Yuvish@11");
	      
	}

	@When("^User click on signin button in signin page$")
	public void user_click_on_signin_button_in_signin_page() throws Throwable {
	    LoginPage lp1=new LoginPage(driver);
	    mouseHoverUsingActions(lp1.getSubmitBtn());
	    clickOnElement(lp1.getSubmitBtn());
	    System.out.println("Successfully Signed in");
	    
	}

	@Then("^User Verify the username displayed in the header$")
	public void user_Verify_the_username_displayed_in_the_header() throws Throwable {
		LoginPage lp2=new LoginPage(driver);
	    String actual=getTextInWebelement(lp2.getVerifyText());
	    System.out.println(actual);
	    Thread.sleep(3000);
	    Assert.assertEquals("Mathi N", actual);
	    
	}

}
