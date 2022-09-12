package StepDefinition;

import Helper.Misc;
import Pages.Admin_Registration_News;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LatestNews_SD {
    Admin_Registration_News ParaLPage = new Admin_Registration_News();

    @When("^I click latest news link$")
    public void clickLatestNews() {
        ParaLPage.clickLatestNewsLink();
        Misc.pause(2);
    }

    @Then("^I verify News title is displayed$")
    public void newsTitleIsDisplayed() {
        Assert.assertTrue(ParaLPage.isNewsTitleDisplayed());
        Misc.pause(2);
    }


}