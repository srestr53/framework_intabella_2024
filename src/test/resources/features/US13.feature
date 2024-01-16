@B31G10-203
Feature: Default


  @B31G10-199
  Scenario: Sales Manager sees the 3 column
    Given the user logged in as "Sales manager"
    When user click the Vehicle Cost page
    Then user sees 3 column names:
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |


  @B31G10-200
  Scenario: Store Manager sees the 3 column
    Given the user logged in as "Store Manager"
    When user click the Vehicle Cost page
    Then user sees 3 column names:
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |


  @B31G10-201
  Scenario:  Store Manager select all vehicle costs
    Given the user logged in as "Store Manager"
    When user click the Vehicle Cost page
    And user select the fist checkbox
    Then selected all row


  @B31G10-202
  Scenario: Sales Manager select all vehicle costs
    Given the user logged in as "Sales Manager"
    When user click the Vehicle Cost page
    And user select the fist checkbox
    Then selected all row