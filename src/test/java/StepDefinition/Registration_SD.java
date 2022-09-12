package StepDefinition;
import Helper.Misc;
import Pages.Admin_Registration_News;
import io.cucumber.java.en.When;

public class Registration_SD {
    Admin_Registration_News ParaLPage = new Admin_Registration_News();

    @When("^I click register button$")
    public void clickRegister() {
        ParaLPage.clickRegistrationBtn();
        Misc.pause(2); }

    @When("^I fill in name box (.+)$")
    public void enterFirstNameReg(String value) {
        ParaLPage.enterFirstNameRegistration("Dalena"); }

    @When("^I fill in last name box (.+)$")
    public void enterLastNameReg(String value) {
        ParaLPage.enterLastNameRegistration("Eyasu"); }

    @When("^I fill in address box (.+)$")
    public void enterAddressReg(String value) {
        ParaLPage.enterAddressRegistration("4444 east avenue"); }

    @When("^I fill in city box (.+)$")
    public void enterCityReg(String value) {
        ParaLPage.enterCityRegistration("Aurora"); }

    @When("^I fill in state box (.+)$")
    public void enterStateReg(String value) {
        ParaLPage.enterStateRegistration("Colorado"); }

    @When("^I fill in zip code box (.+)$")
    public void enterZipCodeReg(String value) {
        ParaLPage.enterZipCodeRegistration("76093"); }

    @When("^I fill in phone box (.+)$")
    public void enterPhoneReg(String value) {
        ParaLPage.enterPhoneRegistration("4444444444"); }

    @When("^I fill in ssn box (.+)$")
    public void enterSSNReg(String value) {
        ParaLPage.enterSSNRegistration("651207548"); }

    @When("^I fill in username box (.+)$")
    public void enterUsernameReg(String value) {
        ParaLPage.enterUsernameRegistration("Dalena"); }

    @When("^I fill in password box (.+)$")
    public void enterPasswordReg(String value) {
        ParaLPage.enterPasswordRegistration("1234"); }

    @When("^I fill in confirm box (.+)$")
    public void enterConfirmReg(String value) {
        ParaLPage.enterConfirmRegistration("1234"); }

    @When("^I click register button on register page$")
    public void clickRegisterBtnOnRegisterPg() {
        ParaLPage.clickRegisterOnRegisterPage();
        Misc.pause(2); }



}