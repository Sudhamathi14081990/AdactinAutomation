package com.cucumber.testrunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.BaseClass;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "json:src\\test\\resource\\com\\cucumber\\reports\\report.json",
		"junit:src\\test\\resource\\com\\cucumber\\reports\\report.xml",
		"html:src\\test\\resource\\com\\cucumber\\reports" },

		features = "src\\test\\java\\com\\cucumber\\feature\\", glue = "com.cucumber.stepdefinition",
		dryRun = false, strict = true, monochrome = true, tags = "@test")
public class TestRunner extends BaseClass {
	public static WebDriver driver;

	@BeforeClass

	public static void beforeclass() throws Throwable {
		System.out.println("Driver Initialization");
		driver = getBrowser("chrome");

	}

	@AfterClass
	public static void afterclass() {
		System.out.println("Driver Quit");
		// driverQuit(driver);

	}
}