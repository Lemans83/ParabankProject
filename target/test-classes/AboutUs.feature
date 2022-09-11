@TC04
Feature: About us on Parabank home webpage
 Scenario: Verify Parasoft Demo Website Displayed
   Given I am on Parabank home webpage
   When I click about us
   And I click the parasoft websitelink
   And I click accept cookies
   And I scroll down to Parasoft Continuous Qaility section
   Then I verify Parasoft Continuous Quality section


