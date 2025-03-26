Feature: Home page Automation of CRM Demo



Background: User is already on logged in
Given User is on login page
When User enters valid "sardars270@gmail.com" and "Plasma12345@"
And Clicks on Login Button
Then User is navigated to Home Page


Scenario Outline: Check Home Page Title
When verify home page title is "Cogmento CRM"
And Close the browser



Scenario Outline: Check Loged in User Name
When verify user name is "barinder barinder"
And Close the browser


Scenario Outline: Check Home Page Link
When verify home page link
And Close the browser

