Feature: Login into amazon Website

  Scenario: Positive scenario to test login functionality
    Given user has opened amazon wevsite on chrome browser
    When user enters the correct username and paasword
  Then user should be able to login

  Scenario: Negative scenario to test login functionality
    Given user has opened amazon wevsite on chrome browser
    When user enters the incorrect username and paasword
    Then user should not be able to login
