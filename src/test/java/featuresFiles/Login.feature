Feature: Search for various products 

@smoke
Scenario: Search for product under electronics category

Given user is on amazon homepage
When user select Electronics category
And enter smartphone in search box
Then proper realted smartphones should be displayed
But do not disply any other items

@end @after
Scenario: Search for product under books category

Given user is on amazon homepage
When user select books category 
And enter rich dad poor dad in search box
Then proper book should be displayed
But do not disply any other items

