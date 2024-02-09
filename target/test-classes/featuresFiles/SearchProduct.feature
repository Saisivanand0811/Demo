Feature: Search for various categerious should be possible along with the product search

@Before @start
Scenario: User should be able to login with valid credentials

Given user is in login page
When user enter valid username and password
And click on ok
Then should be able to login into application

@smoke @all 
Scenario: User should not be able login with invalid credentials

Given user is on login
When user enter valid username and invalid password 
And click on ok
Then error message should be displayed