package StepDefinition;

import Pages.MakeDeposit_06;
import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MakeDeposit_06_SD {
    MakeDeposit_06 MD = new MakeDeposit_06();

//    @Given("^I am on Parabank landing page$")
//    public void lauchParabank () {
//        MyDriver.launchUrlOnNewWindow("https://parabank.parasoft.com/");
//    }
    @Then("^I Verify Make Deposit button is enabled$")
    public void verifyMakeDepositEnabled () {
        Assert.assertTrue(MD.isMakeDepositButtonEnabled(), "Make Deposit Button is not enabled");
    }


}
