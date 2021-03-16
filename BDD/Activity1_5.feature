@activity2_5
Feature: Data driven test with Example

Scenario Outline: Testing with Data from Scenario
    Given User is on Main Login page
    When User enters valid "<Usernames>" and "<Passwords>"
    Then Reads the page title and confirmation message
    And Close the Browser4
    
Examples:
    | Usernames | Passwords |
    | admin     | password  |
    | adminUser | Password  |