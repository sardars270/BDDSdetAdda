Feature: Contact page Automation of CRM Demo

Background: User is already on logged in
Given User is on login page
When User enters valid "sardars270@gmail.com" and "Plasma12345@"
And Clicks on Login Button
Then User is navigated to Home Page
Then User is navigated to Contact Page

Scenario Outline: Select contact by name
Then select contact by name "Barinder Sing"
And Close the browser



Scenario Outline: Check Create New Contact 
Then Click on create new contact hover link
And Enter "firstName" , "lastName" and "Google"
Then Click on save Button
And Close the browser


