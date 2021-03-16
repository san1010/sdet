@activity2_4
Feature: Data driven test without Example

Scenario: Testing with Data from Scenario
    Given User is on Login page2
    When User enters "admin" and "password"
    Then Note the page title and confirmation message
    And Close the Browser3