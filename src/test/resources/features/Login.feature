Feature: Verify user login functionality

  Scenario: verify can login with username and password
    Given user opens application
    Then verify user is on login page
    When user enter username "username"
    And user enter password "password"
    Then verify user login successfully