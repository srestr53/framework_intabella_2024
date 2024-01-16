@B31G10-198
Feature: Vehicles Odometer function verification


	@B31G10-194
	Scenario:  Store Manager odometer module verification
		Given the user logged in as "Store Manager"
		 When user click Vehicle Odometer as enable fleet option
		 Then user sees error message "You do not have permission to perform this action."


	@B31G10-195
	Scenario: Sales Manager odometer module verification
		Given the user logged in as "Sales manager"
		When user click Vehicle Odometer as enable fleet option
		Then user sees error message "You do not have permission to perform this action."


	@B31G10-196
	Scenario:  Driver odometer module default page verification
		Given the user logged in as "Driver"
		 When user click Vehicle Odometer as enable fleet option
		 Then user sees default page as 1


	@B31G10-197
	Scenario:  Driver odometer module Per page verification
		Given the user logged in as "Driver"
		When user click Vehicle Odometer as enable fleet option
		Then user sees View Per Page as 25 by default