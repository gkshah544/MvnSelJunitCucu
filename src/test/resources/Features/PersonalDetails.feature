  Feature: this feature file able to verify my personal details in HRM employee list page

    Scenario: As an admin I should be able to successfully add Employee
      Given I’m logged in to HRM with Admin Account
      And I click on PIM → Add Employee
      Then I fill out First Name, Middle Name, Last Name
      And I verify Employee number is not empty
      Then I click on Save
      And I verify new account got created with correct details