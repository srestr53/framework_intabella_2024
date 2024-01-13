@B31G10-227
Feature: Default

	
	@B31G10-225
	Scenario Outline: US01_TC1 Accessing all the main modules of the app.
		Given the user logged in as "<user>"
		    Then the user sees 8 modules
		    |Dashboards|
		    |Fleet|
		    |Customers|
		    |Sales|
		    |Activities|
		    |Marketing|
		    |Reports & Segments|
		    |System|
		
		    Examples:
		    |user|
		    | sales manager   |
		    |  store manager  |	

	
	@B31G10-226
	Scenario Outline: US01_TC2 Driver should see main modules
		Given the user logged in as "<user>"
		    Then the user sees 4 modules
		
		      |Fleet|
		      |Customers|
		      |Activities|
		      |System|
		
		    Examples:
		      |user|
		      | driver   |