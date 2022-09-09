@latestNews     @Date
Feature: Date Home Page

  Background:
    Given I am on Parabank landing page


  Scenario: Verify listed date on the main page is matching current date
    Then I Verify listed date is matching current date

  Scenario: Verify read me in the bottom of the home page is enabled to the user
    Then I Verify read me in the bottom of the home page is enabled

