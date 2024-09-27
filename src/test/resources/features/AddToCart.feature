Feature: Verify user login functionality

  Scenario: verify can login with username and password
    Given user opens application
    Then verify user is on login page
    When user enter username "username"
    And user enter password "password"
    And user click on the first item
    Then verify user is on first element page
    When user click on addToCart button
    Then verify user added successfully

    Scenario: verify user can double tap the add to cart button
      Given user opens application
      Then verify user is on login page
      When user enter username "username"
      And user enter password "password"
      And user click on the first item
      Then verify user is on first element page
      When user double tap on addToCart button

