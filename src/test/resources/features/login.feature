@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario: Verify login with different user types
    Given the user logged in as "driver"
   # Given the user logged in with username as "User1" and password as "UserUser123"
    Then driver login and see title dashboard

  Scenario: Verify driver login
    Given the user logged in as "sales manager"
    Then driver login and see title dashboard

  Scenario: Verify driver login
    Given the user logged in as "store manager"
    Then driver login and see title dashboard





