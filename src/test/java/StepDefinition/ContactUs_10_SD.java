package StepDefinition;

import Pages.ContactUs_10;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ContactUs_10_SD {
    ContactUs_10 CU = new ContactUs_10();

    @Given("^I go to locations on the main page$")
    public void goToLocations () {
        CU.clickLocations();
    }
    @Then("^I Verify The Parasoft Continuous Quality Platform message is displayed$")
    public void verifyTextDisplayed () {
        Assert.assertTrue(CU.verifyQualityPlatformDisplayed(),"Message is not displayed");
    }
    @Then("^I Verify Explore Parasoft Solutions button is enabled$")
    public void verifyExploreButtonEnabled () {
        Assert.assertTrue(CU.verifyExploreParasoftEnabled(),"Button is not enabled");
    }
    @And("^I click Explore Parasoft Solutions button$")
    public void clickExploreButton () {
        CU.clickExploreButton();
    }
    @And("^I Click Contact us button$")
    public void clickContactusButton () {
        CU.clickContactUs();
    }
    @Then("^I verify Contact us message is displayed$")
    public void verifyContactUsTextDisplayed () {
        Assert.assertTrue(CU.verifyContactUsTextDisplayed(),"Text is not Displayed to the user");
    }

    @And("^I close cookies button$")
    public void clickCookies () {
        CU.dismissCookies();
    }
    @And("^I type my Email address (.+)$")
    public void enterEmail (String email) {
        CU.typeEmail(email);
    }
    @And("^I type my first name (.+)$")
    public void enterFirstName (String firstName) {
        CU.typeFirstName(firstName);
    }
    @And("^I type my last name (.+)$")
    public void enterLastName (String lastName)
    {
        CU.typeLastName(lastName);
    }
    @And("^I type my company name (.+)$")
    public void enterCompanyName (String companyName) {
        CU.typeCompanyName(companyName);
    }
    @And("^I type my job title (.+)$")
    public void enterJobTitle (String jobTitle) {
        CU.typeJobTitle(jobTitle);
    }
    @And("^I type my phone number (.+)$")
    public void enterPhoneNumber (String phoneNum) {
        CU.typePhone(phoneNum);
    }
    @And("^I choose my country (.+)$")
    public void pickTheCountry (String countryName ) {
        CU.selectCountry(countryName);
    }
    @And("^I type my comment (.+)$")
    public void enterMyComments (String yourComment) {
        CU.typeComments(yourComment);
    }
    @And("^I click contact us button$")
    public void clickContact () {
        CU.clickContactButton();
    }
    @Then("^I Verify Thank You! message is displayed$")
    public void verifyMessageDisplayed () {
        Assert.assertTrue(CU.verifyThankYouTextDisplayed(),"Thank You! Message is not displayed to the user");
    }











}
