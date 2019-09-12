 package com.cucumber.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\com\\cucumber\\feature", glue="com.cucumber.stepdefinition"
		)
		// monochrome=true, strict= true,dryRun=false
		

public class TestRunner extends BaseClass {
@BeforeClass
public static void beforeclass() throws Exception {
System.out.println("Driver Initialization");
driver=getBrowser("Chrome");
}
@AfterClass
public static void afterclass() {
	System.out.println("Driver Quit");
	driverQuit(driver);

}

}
