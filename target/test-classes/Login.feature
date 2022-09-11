@TC01
Feature: Login of Parabank home webpage

  Background:
   Given I am on Parabank home webpage

  Scenario:Verify valid login
    When I enter valid username Shakarik2022
    And I enter valid password 123456
    And I click login button
    Then I verify Account Overview message is displayed

@TC02
  Scenario:Verify invalid login
    When I enter invalid username %%%%%%
    And I enter invalid password *****
    And I click login button
    Then I verify Error message is displayed