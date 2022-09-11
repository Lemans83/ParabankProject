package StepDefinition;

import Helper.Misc;
import Pages.LoginPage;
import Web.MyDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import javax.swing.*;

public class LoginSD {

    LoginPage loginPB = new LoginPage();
//TC_01
    @Given("I am on Parabank home webpage")
    public void launchWepbage (){
        MyDriver.launchUrlOnNewWindow("https://parabank.parasoft.com/");
    }

   @When("^I enter valid username (.+)$")
    public void enterUsername(String value){
        loginPB.myUsername(value);
   }

   @And("^I enter valid password (.+)")
    public void enterPassword(String value){
        loginPB.myPassword(value);
       // Misc.pause(2);
   }

   @And("I click login button")
        public void clickLoginButton(){
        loginPB.clickLoginBtn();
   }

   @Then("I verify Account Overview message is displayed")
    public void verAccountOverviewIsDsiplayed(){
       Assert.assertTrue(loginPB.verTitleMessageIsDisplayed());
       MyDriver.quitWindows();
   }

//TC_02
   @When("^I enter invalid username (.+)$")
   public void invUsername (String value){
        loginPB.uernameIsInvalid(value);
   }

  @And("^I enter invalid password (.+)$")
    public void invPassword (String value){
        loginPB.passwordIsInvalid(value);
       // Misc.pause(5);
  }

  @Then("^I verify Error message is displayed$")
    public void errorMessage(){
        Assert.assertTrue(loginPB.errorMessageIsDisplayed()); // This step has Bug because it runs with invalid credentials.
        MyDriver.quitWindows();
      }
}
