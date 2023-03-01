Feature: Task page feature

Background:
Given User has already logged in to application and clicked on Task tab

@Smoke
Scenario: validate task page 
Given User is on Task page
Then Task Tab is displayed
And Add new field is displayed
#And newCustomer field is displayed
#And customer Name Field is displayed
#And customer Discription Field  is displayed
#And Import Projects Descriptions CheckBox  is displayed
#And Import Tasks Descriptions CheckBox displayed

@Regression
Scenario: Go to new customer create pop up
Given User is on task tab
When User clicks on add new button and clicks on  NEW CUSTOMER feild
And user enters customer name
And  user enters customer description
And user selctes checkbox
And clicks on create customer button
Then New costumer should be created
