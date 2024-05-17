Feature: Login Functionality

  @demoTest
  Scenario Outline: User successfully logs in with correct credentials
    Given Launch Website
    When I enter my username "<username>" and password "<password>"
    And I click the login button
    Then I should be logged in successfully

    Examples:
      | username      | password     |
      | standard_use | secret_sauce |

  @demoTest1
  Scenario Outline: User successfully logs in with correct credentials
    Given Launch Website
    When I enter my username "<username>" and password "<password>"
    And I click the login button
    Then I should be logged in successfully

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |





