@B31G10-220
Feature: Default

	#{color:#FF0000}+*User Story*+{color}
	#
	#*US05:* As a user, I want to view columns on the Vehicles Model page. (web-table)
	#
	#{color:#FF0000}+*Acceptance Criteria*+{color}
	#
	#{*}AC1:{*}Verify that the Store manager and Sales manager can see 10 columns on the Vehicles Model page.
	#
	#Expected Column names:
	#
	#MODEL NAME, MAKE, CAN BE REQUESTED, CVVI,   CO2 FEE (/MONTH), COST (DEPRECIATED), TOTAL COST (DEPRECIATED), CO2 EMISSIONS, FUEL TYPE, VENDORS
	@B31G10-218
	Scenario Outline: US05_TC1_AC1_Users with access to Vehicle Model Page
		Given the user logged in as "<user>"
		    When the user is on Vehicle Model Page
		    Then user sees 10 columns
		      | MODEL NAME            |
		      | MAKE                    |
		      | CAN BE REQUESTED         |
		      | CVVI                     |
		      | CO2 FEE (/MONTH)         |
		      | COST (DEPRECIATED)       |
		      | TOTAL COST (DEPRECIATED) |
		      | CO2 EMISSIONS            |
		      | FUEL TYPE                |
		      | VENDORS                  |
		
		    Examples:login data we are going to use in this scenario outline
		      | user          |
		      | sales manager |
		      | store manager |	

	#User Story
	#
	#*US05:As a user, I want to view columns on the Vehicles Model page. (web-table){*}{*}
	#
	#Acceptance Criteria
	#
	#*AC 2:* Verify that Drivers cannot access the Vehicles Model page and see “You do not have permission to perform this action.” message on the screen.
	@B31G10-219
	Scenario: US05_TC2_AC2_Users with not access to Vehicle Model Page
		Given the user logged in as "driver"
		    When the user is on Vehicle Model Page
		    Then the user cannot access and sees this Msg "You do not have permission to perform this action."