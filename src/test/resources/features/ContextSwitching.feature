Feature: Verify user context functionality

  Scenario: verify
    Given user opens application
    Then verify user is on login page
    When user enter username "username"
    And user enter password "password"
    When user click on WebView
    Then verify user is on WebView Selection page
    When user enters the site
    Then verify user is on the website
    And print context


