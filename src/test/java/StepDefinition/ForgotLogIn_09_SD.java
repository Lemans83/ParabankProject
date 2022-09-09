package StepDefinition;

import Pages.ForgotLogIn_09;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ForgotLogIn_09_SD {
    ForgotLogIn_09 FLGN = new ForgotLogIn_09();

    @When("^I go to Forgot Login Info on the main page$")
    public void clickTheButton () {
        FLGN.clickForgotLogInButton();
    }
    @And("^I click Find my login button$")
    public void clickFindBtn () {
        FLGN.clickFindMyLogInButton();
    }
    @Then("^I Verify Please fill out the following information in order to validate your account message is displayed$")
    public void verifyTextDidplayed () {
        Assert.assertTrue(FLGN.verifyLookUpTextDisplayed(),"Look up message is not displayed");
    }
    @Then("^I Verify Find my login button is enabled$")
    public void verifyFindMyLgnEnabled () {
        Assert.assertTrue(FLGN.verifyFinfMyLogInEnabled(),"Find my login button is not enabled");
    }
    @Then("^I Verify error message is displayed next to first name$")
    public void verifyErrorMsgDisplayed () {
        Assert.assertTrue(FLGN.verifyErrorMsgOnEmptyFirstNameDisplayed(),"Error Message is not displayed");
    }

    @Then("^I Verify error message is displayed next to last name table$")
    public void verifyLastNameErrorMsgDisplayed () {
        Assert.assertTrue(FLGN.verifyErrorMsgOnEmptyLastNameDisplayed(),"Error Message is not displayed");
    }

    @Then("^I Verify error message is displayed next to address table$")
    public void verifyAddressErrorMsgDisplayed () {
        Assert.assertTrue(FLGN.verifyErrorMsgOnEmptyAddressDisplayed(),"Error Message is not displayed");
    }

    @Then("^I Verify error message is displayed next to city table$")
    public void verifyCityErrorMsgDisplayed () {
        Assert.assertTrue(FLGN.verifyErrorMsgOnEmptyCityDisplayed(),"Error Message is not displayed");
    }

    @Then("^I Verify error message is displayed next to state table$")
    public void verifyStateErrorMsgDisplayed () {
        Assert.assertTrue(FLGN.verifyErrorMsgOnEmptyStateDisplayed(),"Error Message is not displayed");
    }

    @Then("^I Verify error message is displayed next to zip code table$")
    public void verifyZipCodeErrorMsgDisplayed () {
        Assert.assertTrue(FLGN.verifyErrorMsgOnEmptyZipCodeDisplayed(),"Error Message is not displayed");
    }

    @Then("^I Verify error message is displayed next to SSN table$")
    public void verifySSNErrorMsgDisplayed () {
        Assert.assertTrue(FLGN.verifyErrorMsgOnEmptySSNDisplayed(),"Error Message is not displayed");
    }












}
