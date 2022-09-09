@TC05
Feature: Services on Parabank home webpage
  Scenario: Verify the message Parabank services is displayed
    Given I am on Parabank home webpage
    When I click Services
    Then I verify Available Bookstore SOAP services is displayed
    And I scroll down to Parabank Services section
    Then I verify Parabank Services message is displayed