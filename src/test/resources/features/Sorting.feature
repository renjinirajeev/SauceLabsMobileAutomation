Feature: Sorting functionality

  Scenario: verify can sort using price
    Given user opens application
    Then verify user is on login page
    When user enter username "username"
    And user enter password "password"
    Then verify user can login successfully
    When user filter by price high to low
    Then verify the product are filtered by high to low