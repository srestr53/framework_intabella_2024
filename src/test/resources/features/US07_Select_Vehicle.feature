@B31G10-224
Feature:As a user (Sales and Store manager)
	I should be able to select any vehicle  from the Vehicles page (web table)

	AC #1:
	Verify that once the users launch on the Vehicles page, the users can see all the checkboxes as unchecked.
	AC #2:
	Verify that users can check the first checkbox to select all the cars
	AC #3:
	Verify that users can select any car

	@B31G10-223
	Scenario Outline: Verify that users can select any car
		Given the user logged in as "<userType>"
		When Navigate to the Vehicles page
		Then Verify that users can select any car
		Examples:
			| userType      |
			| sales manager |
			| store manager |


	@B31G10-222
	Scenario Outline: Verify that users can check the first checkbox to select all the cars
		Given the user logged in as "<userType>"
		When Navigate to the Vehicles page
		Then Users can check the first checkbox to select all the cars
		Examples:
					| userType      |
					| sales manager |
					| store manager |	


	@B31G10-221
	Scenario Outline: Verify that once the users launch on the Vehicles page, the users can see all the checkboxes as unchecked.
		Given the user logged in as "<userType>"
		When Navigate to the Vehicles page
		Then the users can see all the checkboxes as unchecked.
		Examples:
					| userType      |
					| sales manager |
					| store manager |