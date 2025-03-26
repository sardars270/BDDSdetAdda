Feature: Login page Automation of CRM Demo

Background: User is already on login page
Given User is on login page

Scenario Outline: Check Login is successful With Valid Creds
When User enters valid "<username>" and "<password>"
And Clicks on Login Button
Then User is navigated to Home Page
And Close the browser

Examples:
| username | password |
| sardars270@gmail.com | Plasma12345@ |
| sardars270@gmail.com | password |



# dumy scenario just to show reuse of code..
Scenario Outline: Check Login is successful With Valid Creds
When User enters valid "<username>" and "<password>"
And Clicks on Forgot Password Button 
Then User is navigated to Forgot Password Page
And Close the browser

Examples:
| username | password |
| sardars270@gmail.com | Plasma12345@ |


