Feature: Registration functionality


  Scenario: Verify Registration feature works
    Given I am on Parabank landing page
    When I click register button
    And I fill in name box Dalena
    And I fill in last name box Eyasu
    And I fill in address box 4444 east avenue
    And I fill in city box Aurora
    And I fill in state box Colorado
    And I fill in zip code box 76093
    And I fill in phone box 4444444444
    And I fill in ssn box 651207548
    And I fill in username box Dalena
    And I fill in password box 1234
    And I fill in confirm box 1234
    When I click register button on register page
    Then I close windows
