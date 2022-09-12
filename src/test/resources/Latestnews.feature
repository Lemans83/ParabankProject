Feature: Latest News

  Scenario: Verify messages are displayed on Latest News tab
    Given I am on Parabank landing page
    When I click latest news link
    Then I verify News title is displayed
    Then I close windows
