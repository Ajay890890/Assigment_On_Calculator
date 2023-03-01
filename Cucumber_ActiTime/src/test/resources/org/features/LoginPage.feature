Feature: ActiTime Login Feature

@Smoke
Scenario: Validate login page
Given User is on login page
Then user name field is displayed
And Password field is displayed
And Login button is displayed

@Regression
Scenario: Verify login functionality
Given User is on login page
When user enters username
And user enters password
And user clicks on login botton
And Dashborad title is "actiTIME - Enter Time-Track123"

