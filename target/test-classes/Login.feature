@TC01
Feature: Login of Parabank home webpage
  Scenario:Verify valid login
    Given I am on Parabank home webpage
    When I enter valid username Shakarik2022
    And I enter valid password 123456
    And I click login button
    Then I verify Account Overview message is displayed

@TC02
  Scenario:Verify invalid login
    Given I am on Parabank home webpage
    When I enter invalid username Ghoz35
    And I enter invalid password 98765
    And I click login button
    Then I verify Error message is displayed