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
    Given the user logged in as "<userType>"
    When user is on the calendar events page
    And user click on the Create Calendar Event page
    And user enters "<invalidNumber>" in repeat every box
    Then user sees an "<expectedErrorMessage>"

    Examples:
      | userType | invalidNumber | expectedErrorMessage                   |
      | driver   | -2            | The value have not to be less than 1.  |
      | driver   | 110           | The value have not to be more than 99. |

    Examples:
      | userType      | invalidNumber | expectedErrorMessage                   |
      | sales manager | -2            | The value have not to be less than 1.  |
      | sales manager | 110           | The value have not to be more than 99. |

    Examples:
      | userType      | invalidNumber | expectedErrorMessage                   |
      | store manager | -2            | The value have not to be less than 1.  |
      | store manager | 110           | The value have not to be more than 99. |




