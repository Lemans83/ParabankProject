@errorMsgIsDisplayedWithEmptyEntry   @sanity

  @TC_09

Feature: Forgot Login


  Background:
    Given I am on Parabank landing page
    When I go to Forgot Login Info on the main page
    And I click Find my login button


  Scenario: Verify Please fill out the following information in order to validate your account message is displayed
    Then I Verify Please fill out the following information in order to validate your account message is displayed


  Scenario: Verify Find my login button is enabled
    Then I Verify Find my login button is enabled


  Scenario: Verify error message is displayed next to first name empty entry
    Then I Verify error message is displayed next to first name


  Scenario: Verify error message is displayed next to last name empty entry
    Then I Verify error message is displayed next to last name table


  Scenario: Verify error message is displayed next to address empty entry
    Then I Verify error message is displayed next to address table


  Scenario: Verify error message is displayed next to city empty entry
    Then I Verify error message is displayed next to city table


  Scenario: Verify error message is displayed next to state empty entry
    Then I Verify error message is displayed next to state table


  Scenario: Verify error message is displayed next to zip code empty entry
    Then I Verify error message is displayed next to zip code table


  Scenario: Verify error message is displayed next to SSN empty entry
    Then I Verify error message is displayed next to SSN table








