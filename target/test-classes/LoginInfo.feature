@TC03
Feature: Logininfo of Parabank home webpage
  Scenario: Fill out customer look up
    Given I am on Parabank home webpage
    When I click login info
    Then I verify the Customer Lookup message is displayed
    And  I fill out the information in the box
    And I click Find My Login Info button
    Then I verify the error message is displayed
