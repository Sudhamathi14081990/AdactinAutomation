Feature: AutomationPractice End To End Test Case

Scenario: Verify the customer or user is able to login the application
Given user launch the AutomationPractice application   	
When User click on the signin button in the header
And User Enter email id in Signin Page
And User Enter Password in Signin page
And User click on signin button in signin page
Then User Verify the username displayed in the header

