
  Feature:  This feature file validates job title Page with header

    Background:
      Given users navigates to hrm login page


    Scenario: User should be able to login to HRM with valid credentials
      When users enters "yoll-student" and "Bootcamp5#" and clicks login button
      Then  user should able verify HRM homepage with "Welcome Yoll" header on page

    Scenario: User should able to verify job title page
      When user click on admin tab and job and job title
      Then user validates "Job Titles" header on the page


