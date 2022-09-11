@contactUsPage     @smoke

  @TC_10

Feature: ContactUs Page

  Background:
    Given I am on Parabank landing page
    When I go to locations on the main page

  Scenario: Verify The Parasoft Continuous Quality Platform is displayed for the user
     Then I Verify The Parasoft Continuous Quality Platform message is displayed

  Scenario: Verify Explore Parasoft Solutions button is enabled
     Then I Verify Explore Parasoft Solutions button is enabled

  Scenario: Verify Contact us message is displayed
    And  I click Explore Parasoft Solutions button
    And  I Click Contact us button
    Then I verify Contact us message is displayed

  Scenario: Verify Thank You! message is displayed
     And I click Explore Parasoft Solutions button
     And I Click Contact us button
    And I close cookies button
     And I type my Email address code.dd@yahoo.com
     And I type my first name Amanda
     And I type my last name Hana
     And I type my company name ASD
     And I type my job title Lead
     And I type my phone number 5555555555
     And I choose my country United States
     And I type my comment Good work!
     And I click contact us button
    Then I Verify Thank You! message is displayed






