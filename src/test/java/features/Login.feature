Feature: Login to Application feature



Scenario: Login with valid credentials
Given Launch netbanking application
When Click on login button
And Enter username and password, then click on ok
Then Verify user logged in successfully
And Close the browser

