Feature: Verify user login functionality

  Scenario: verify can login with username and password
    Given user opens application
    Then verify user is on login page
    When user enter username "username"
    And user enter password "password"
    And user click on the first item
    Then verify user is on first element page
    When user click on the addToCart button
    And user click on cart icon
    Then verify is on checkout page
    And user click on checkout button
    And user fill details on checkout details
    And user click finish button
    Then verify user complete checkout
