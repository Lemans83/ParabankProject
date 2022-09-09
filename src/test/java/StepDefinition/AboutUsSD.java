package StepDefinition;

import Helper.Misc;
import Pages.AboutUsPage;
import Web.MyDriver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AboutUsSD {

    AboutUsPage aboutUs = new AboutUsPage();

//TC_04
    @When("I click about us")
      public void clickAboutUsCompnonent(){
      aboutUs.clickAboutUs();
    }

    @And("I click the parasoft websitelink")
      public void clickTheWebsiteLink (){
      aboutUs.clickWebsiteLink();
  }

    @And("I click accept cookies")
      public void clickAcceptCookies (){
        aboutUs.acceptCookies();
        Misc.pause(3);
    }

    @And("I scroll down to Parasoft Continuous Qaility section")
      public void scrollDownByWebelement(){
      aboutUs.scrollDown();
  }

    @Then("I verify Parasoft Continuous Quality section")
      public void verifyParasoftContinQualityDisplayed(){
      Assert.assertTrue(aboutUs.parasoftContniuousQualityDisplayed());
      Misc.pause(2);
       MyDriver.quitWindows();
   }


}
