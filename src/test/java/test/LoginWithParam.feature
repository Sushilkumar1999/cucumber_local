Feature: Login into amazon website
  
  @Regression
  Scenario Outline: Positive scenario to test login functinonality
    Given user has opened amazon wevsite on chrome browser
    When User enters correct "<username>" and "<password>"
    Then user should be able to login

    Examples: 
      | username    | password |
      | abc@xyz.com | abc123   |
      | pqr@abc.com | sa1234   |


  @Sanity
  Scenario Outline: Positive scenario to test login functinonality
    Given user has opened amazon wevsite on chrome browser
    When User enters correct "<username>" and "<password>"
    Then user should be able to login

    Examples: 
      | username     | password |
      | abcd@xyz.com | abc123   |

  @Regression
  Scenario Outline: Positive scenario to test login functinonality
    Given user has opened amazon wevsite on chrome browser
    When User enters correct "<username>" and "<password>"
    Then user should be able to login

    Examples: 
      | username       | password |
      | sushil@xyz.com | abc123   |
