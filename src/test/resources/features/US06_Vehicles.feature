@B31G10-183
Feature: Vehicle page view, edit, delete options.
 @B31G10-182
  Scenario Outline: Users see “view, edit, delete” options
   Given the user logged in as "<user>"
    When User is on vehicles page and hovers over the three dots
   Then User sees view, edit, and delete options
    Examples:
    |user|
    |driver|
    |sales manager|
    |store manager|


