
Feature: login into isay account with valid credentials
  

  @login
Scenario: with valid credentials
Given i was in isay login page
When i entered valid username and password    
    |Email|saisivanand143@gmail.com|
    |Password|@Myworld99|
And i click on login button
Then should be display isay homepage


