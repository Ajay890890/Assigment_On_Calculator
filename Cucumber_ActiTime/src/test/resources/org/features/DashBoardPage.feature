Feature: ActiTime DashBord feature

Background:
Given User has already logged in to application
#|username|password|
#|admin|manager|
#|admin1|manager1|

@Smoke
Scenario: Dashbord page title
Then Page title should be "actiTIME - Enter Time-Track"

@Regression @Smoke
Scenario: Number of tabs present on dashboard
Then User should get 4 tabs


#@Regression
#Scenario: Verify dashborad functionality
#Given User is on dashboard page
#When user enters valide credential and hits login button
#Then Dashborad page has 4 tabs
#@Smoke
#Scenario: Verify default selected tab
#Given User is on dashboard page
#When user enters valide credential and hits login button
#Then TIME-TRACK tab should be selected by default