Feature: login into isay account

Scenario Outline: as a registered user i should be able to login into application

Given i was on isay login page
When i entered valid username as "<Username>" and password as "<Password>" into the fields
Then i should be able to login into the application
And close the browser

Examples:
 |Username              |Password|
 |saisivanad66@gmail.com|@Myworld99|
 |Saisivanand143@gmail.com|@Myworld99|