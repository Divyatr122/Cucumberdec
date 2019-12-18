@functional 
Feature: Sign-up
Scenario Outline: 
Sign-up should be quick and friendly



  Given I have chosen to sign up
 When I sign up with valid deails
 Then I should receive a confirmation email
 And I should see a personalized greeting message
 
 Examples:
 |Sign-up|
 
 @credentials
 Scenario: Login with valid credentials

 Given Navigate to Home Page
 When user enters username and password
 Then User logged in successfull
 