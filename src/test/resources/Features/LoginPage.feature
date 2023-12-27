@regression
Feature: User should able to login to HRM with Valid Credentials

  Background:
    Given users navigates to hrm login page


  Scenario Outline: : User should not be able to login to HRM with invalid and empty credentials
    When users enters "<username>" and "<password>" and clicks login button
    Then user should Validates "<errorMessage>" in login page
    Examples:
      |username|password|errorMessage|
      |xyz|Bootcamp5#|Invalid credentials|
      |yoll-student|abc|Invalid credentials|
      | |Bootcamp5#|Username cannot be empty|
      |yoll-student| |Password cannot be empty|


  Scenario: User should be able to login to HRM with valid credentials
   When users enters "yoll-student" and "Bootcamp5#" and clicks login button
   Then  user should able verify HRM homepage with "Welcome Yoll" header on page

