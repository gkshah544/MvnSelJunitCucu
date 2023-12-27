
Feature: This features validates frames

    Scenario: User should able to validates frames
      Given user able to navigate to herokuapp page
      When user clicks on frames and nested frames tab
      Then user should able switch innerr to outer tabs and vice versa
      Then able to print text from left frame in console
