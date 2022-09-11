package StepDefinition;

import Helper.Misc;
import Pages.Products_07;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Products_07_SD {

    Products_07 Prod = new Products_07();

    @When("^I go to Products on the main page$")
    public void clickProductButton () {

        Prod.clickProducts();
        Misc.pause(2);
    }
    @Then("^I Verify Innovation and Intelligent Software Testing Platform message is displayed$")
    public void VerifyMessageDisplayed () {
        Assert.assertTrue(Prod.verifyTextIsDisplayed(), "Text is not displayed");
    }
    @Then("^I Verify See in Action button is enabled$")
    public void verifySeeInActionEnabled () {
        Assert.assertTrue(Prod.verifySeeInActionIsEnabled(), "See In Action button is notn enabled");
    }


}
