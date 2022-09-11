package StepDefinition;

import Helper.Misc;
import Pages.LoginInfoPage;
import Web.MyDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginInfoSD {

    LoginInfoPage logInfoPage = new LoginInfoPage();

// TC_03
    @When("^I click login info$")
    public void clicLoginInfo() {
        logInfoPage.clickLogInfolink();
       // Misc.pause(2);
    }
    @Then("^I verify the Customer Lookup message is displayed$")
    public void customerLookupMessageIsDisplayed() {
        Assert.assertTrue(logInfoPage.verCustLookUpDisplayed());
       // Misc.pause(2);
    }
    @And("^I fill out the information in the box$")
    public void typeFisrtName() {
        logInfoPage.addFirstName("Turdiboy");
        logInfoPage.addLastName("Kuluhboy");
        logInfoPage.addAddress("6501 21st Ave, Apt 4B");
        logInfoPage.addCityAddress("Brooklyn");
        logInfoPage.addStateAddress("New York");
        logInfoPage.addZipCode("11214");
        logInfoPage.addSsnAddress("111-23-5055");
    }
    @And("I click Find My Login Info button")
    public void loginInfoButton() {
        logInfoPage.MyLoginInfoButton();
     //   Misc.pause(2);
    }
    @Then("I verify the error message is displayed")
        public void messageErrorIsDisplayed(){
        Assert.assertTrue(logInfoPage.errorMessageIsDisplayed());
        MyDriver.quitWindows();
    }

}











