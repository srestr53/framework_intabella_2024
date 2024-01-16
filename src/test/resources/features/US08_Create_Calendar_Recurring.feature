@B31G10-190
Feature:create a recurring (repetitive) calendar event
	User Story:
		As a user, I want to create a recurring (repetitive) calendar event
	AC #1:
		Verify that users see the number “1” by default in the Repeat Every input option.
	AC #2:
		Verify that users see the error message “This value should not be blank.”
		when the Calendar event Repeat Every field is cleared (delete the number 1).


	@B31G10-184
	Scenario Outline:Verify user in different department can see the number "1" by default in the Repeat Every input option.
		Given the user logged in as "<userType>"
		When Navigate to the calendar event
		And Navigate to the calendar event creation section.
		And Navigate to the Repeat Every box
		Then Verify if the default value displayed in the Repeat Every box is "1".

		Examples:
			| userType      |
			| driver        |
			| sales manager |
			| store manager |



	@B31G10-185
	Scenario Outline: Verify that users see the number “1” by default after change the input value in the Repeat Every input option.
		Given the user logged in as "<userType>"
		When Navigate to the calendar event
		And Navigate to the calendar event creation section.
		And Navigate to the Repeat Every box
		And Change the value in the Repeat Every box to another valid number
		And Refresh the page
		And Navigate to the Repeat Every box
		Then Verify if the default value displayed in the Repeat Every box is "1".
		Examples:
			| userType      |
			| driver        |
			| sales manager |
			| store manager |

	@B31G10-186
	Scenario Outline: Verify that users see the error message “This value should not be blank.” when the Calendar event Repeat Every field is cleared (delete the number 1).
		Given the user logged in as "<userType>"
		When Navigate to the calendar event
		And Navigate to the calendar event creation section.
		And Navigate to the Repeat Every box
		And Delete the number from the Repeat Every box
		Then Verify if the error message "This value should not be blank." is displayed
		Examples:
			| userType      |
			| driver        |
			| sales manager |
			| store manager |