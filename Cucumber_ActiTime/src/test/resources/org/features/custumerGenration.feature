Feature: Lets be Friends

@smoke @regression

Scenario: Validate login page
Given user is on main page
Then name and email field should be present

Scenario: Verify lets be friend functionality
Given user is on main page
When User enters name and email
And user clicks on next section button then next page should be opened
Then 2 radio buttons should be present 
When user selects l like ps4 radio button
And click on next section new section should be opened
Then Ok button should be present
When user clicks on ok button 
Then one Pop-up should should show text "awesome!"







