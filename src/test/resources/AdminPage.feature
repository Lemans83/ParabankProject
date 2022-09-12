Feature: AdminPage

  Scenario: Verify Administration message is displayed on Admin Page
    Given I am on Parabank landing page
    When I click Admin Page
    Then I verify Administration title is displayed
    And I close windows