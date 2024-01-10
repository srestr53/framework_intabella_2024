Feature: Default

	
	@B31G10-192
	Scenario Outline: Verify that users see error messages when enter invalid integers
		Given the user logged in as "driver"
			When user is on the calendar events page
			And user is on the Create Calendar Event page
			And user enters "<invalidNumber>" in repeat every box
			Then user sees an error message 
			
			Examples: 
			|invalidNumber|
			|-2|
			|110|