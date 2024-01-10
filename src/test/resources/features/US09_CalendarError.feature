@CalendarErr
Feature:
  User Story :
  As a user, I should see error messages when I enter an invalid integer number into the calendar Repeat Every input box.

  AC #1:

  Verify that users see error messages when enter invalid integers.

  If enter less than 1 —> users should see “The value have not to be  less than 1.”

  If enter more than 99 —> users should see “The value have not to be more than 99.”


  @B31G10-192
  Scenario Outline: Verify that users see error messages when enter invalid integers
    Given the user logged in as "driver"
    When user is on the calendar events page
    And user click on the Create Calendar Event page
    And user enters "<invalidNumber>" in repeat every box
    Then user sees an error message

    Examples:
      | invalidNumber |
      | -2            |
      | 110           |

  Scenario Outline: Verify that users see error messages when enter invalid integers
    Given the user logged in as "sales manager"
    When user is on the calendar events page
    And user click on the Create Calendar Event page
    And user enters "<invalidNumber>" in repeat every box
    Then user sees an error message

    Examples:
      | invalidNumber |
      | -2            |
      | 110           |

  Scenario Outline: Verify that users see error messages when enter invalid integers
    Given the user logged in as "store manager"
    When user is on the calendar events page
    And user click on the Create Calendar Event page
    And user enters "<invalidNumber>" in repeat every box
    Then user sees an error message

    Examples:
      | invalidNumber |
      | -2            |
      | 110           |
