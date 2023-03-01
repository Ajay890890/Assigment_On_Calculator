Feature: Login page feature
 
Scenario Outline: Login with multiple users
Given User has already logged in to app
	When User enters username as <USERNAME>
	And User enters passowrd as <PASSWORD>
	And User clicks on login button

	Examples:
	|USERNAME|PASSWORD|
	|"admin"|"manager"|  
	|"admin1"|"manager1"|
	|"admin2"|"manager2"|
	
#	Scenario Outline is bound to Examples Tag