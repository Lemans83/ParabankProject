package StepDefinition;

import Helper.Misc;
import Pages.ServicesPage;
import Web.MyDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;

public class ServicesSD {

    ServicesPage serviceComp = new ServicesPage();

//TC_05
  @When("I click Services")
    public void clickServiceComp(){
      serviceComp.clickServices();
  }

  @Then("I verify Available Bookstore SOAP services is displayed")
    public void verSaopHeading(){
        Assert.assertTrue(serviceComp.veriSoapHeadingMessageDisplayed());
        Misc.pause(2);
    }

  @And("I scroll down to Parabank Services section")
    public void scrollDown(){
     serviceComp.scrollDowntoElement();
  }

  @Then("I verify Parabank Services message is displayed")
    public void verParabankServiceDisplayed(){
        Assert.assertTrue(serviceComp.verParabankServiceIsDisplayed());
        MyDriver.quitWindows();
    }






}
