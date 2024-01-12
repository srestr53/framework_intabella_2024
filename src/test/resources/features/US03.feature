
Feature: Default

	User Story: As a user, I want to learn how to use the pinbar.
	AC #1: Verify that when users click the "Learn how to use this space" link on the homepage, users see.
	"How To Use Pinbar" and
	"Use pin icon on the right top corner of page to create fast access link in the pinbar."

	AC #2: Verify that users see an image on the page.
	(For automation testing, just verify the image source.)
	Expected source:/bundles/oronavigation/images/pinbar-location.jpg

	@B31G10-204
	Scenario Outline: User Verify header and description
		Given the user logged in as "<userType>"
		When the user click on the Learn how to use this space
		Then the user should see "How To Use Pinbar"
		Then the user should see a "Use pin icon on the right top corner of page to create fast access link in the pinbar."
		
			Examples:
			    |userType|
				|driver  |
				|sales manager|
				|store manager|	

	
	@B31G10-205
	Scenario Outline: User verify the image on the page
		Given the user logged in as "<userType>"
		When the user click on the Learn how to use this space
		Then the user should see an image on the page with expected source: "/bundles/oronavigation/images/pinbar-location.jpg"
		
			Examples:
				|userType|
				|driver  |
				|sales manager|
				|store manager|