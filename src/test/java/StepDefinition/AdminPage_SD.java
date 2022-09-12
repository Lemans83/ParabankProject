package StepDefinition;

import Pages.Admin_Registration_News;
import Helper.Misc;
import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AdminPage_SD {
    Admin_Registration_News ParaLPage = new Admin_Registration_News();

    @Given("^I am on Parabank landing page$")
    public void openPara() { MyDriver.launchUrlOnNewWindow("https://parabank.parasoft.com/"); }

    @When("^I click Admin Page$")
    public void clickAdminPage() { ParaLPage.clickAdminPageBtn();
        Misc.pause(2); }

    @Then("^I verify Administration title is displayed$")
    public void administrationTitleIsDisplayed() {
        Assert.assertTrue(ParaLPage.isAdminTitleDisplayed());
        Misc.pause(2); }

    @Then("^I close windows$")
    public void closeWindows() {
        MyDriver.quitWindows(); }








}
