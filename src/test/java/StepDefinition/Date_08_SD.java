package StepDefinition;

import Pages.Date_08;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Date_08_SD {

    Date_08 date = new Date_08();

    @Then("^I Verify listed date is matching current date$")
    public void verifyCurrentDateOnThePage () {
        Assert.assertTrue(date.verifyCurrentDateDisplayed(),"Dates are not matching");

    }


    @Then("^I Verify read me in the bottom of the home page is enabled$")
    public void verifyReadMeIsEnabled () {
        Assert.assertTrue(date.verifyReadMeEnabled(),"Read Me is not enabled");

    }


}
