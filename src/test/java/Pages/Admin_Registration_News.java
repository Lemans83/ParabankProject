package Pages;

import org.openqa.selenium.By;

public class Admin_Registration_News extends Commands {

    By mainAdminPageBtnLocator = By.xpath("//a[text()='Admin Page']");
    By adminTitleLocator = By.xpath("//h1");
    By envelopeBtnLocator = By.xpath("//a[text()='contact']");
    By registrationBtnLocator = By.xpath("//a[text()='Register']");
    //registrationPage
    By registrationFirstNameInputLocator = By.id("customer.firstName");
    By registrationLastNameInputLocator = By.id("customer.lastName");
    By registrationAddressInputLocator = By.id("customer.address.street");
    By registrationCityInputLocator = By.id("customer.address.city");
    By registrationStateInputLocator = By.id("customer.address.state");
    By registrationZipCodeInputLocator = By.id("customer.address.zipCode");
    By registrationPhoneNumberInputLocator = By.id("customer.phoneNumber");
    By registrationSSNInputLocator = By.id("customer.ssn");
    By registrationUsernameInputLocator = By.id("customer.username");
    By registrationPasswordInputLocator = By.id("customer.password");
    By registrationConfirmPassInputLocator = By.id("repeatedPassword");
    By registerBtnOnRegisterPgLocator = By.xpath("//input[@value='Register']");

    By latestNewsReopenedLinkLocator = By.xpath("//a[text()='ParaBank Is Now Re-Opened']");
    By paraBankNewsTitleLocator = By.xpath("//h1");




    public void clickAdminPageBtn() {
        clickIt(mainAdminPageBtnLocator); }

    public boolean isAdminTitleDisplayed() {
        return isElementDisplayed(adminTitleLocator); }

    public boolean isEnvelopeBtnEnabled() {
        isElementEnabled(envelopeBtnLocator);
        return true; }

    public void clickRegistrationBtn() {
        clickIt(registrationBtnLocator); }

    //Registration page:

    public void enterFirstNameRegistration(String value) {
        type(registrationFirstNameInputLocator,value); }

    public void enterLastNameRegistration(String value) {
        type(registrationLastNameInputLocator,value); }

    public void enterAddressRegistration(String value) {
        type(registrationAddressInputLocator,value);}

    public void enterCityRegistration(String value) {
        type(registrationCityInputLocator,value);}

    public void enterStateRegistration(String value) {
        type(registrationStateInputLocator,value);}

    public void enterZipCodeRegistration(String value) {
        type(registrationZipCodeInputLocator,value);}

    public void enterPhoneRegistration(String value) {
        type(registrationPhoneNumberInputLocator,value);}

    public void enterSSNRegistration(String value) {
        type(registrationSSNInputLocator,value);}

    public void enterUsernameRegistration(String value) {
        type(registrationUsernameInputLocator,value);}

    public void enterPasswordRegistration(String value) {
        type(registrationPasswordInputLocator,value);}

    public void enterConfirmRegistration(String value) {
        type(registrationConfirmPassInputLocator,value);}

    public void clickRegisterOnRegisterPage() {
        clickIt(registerBtnOnRegisterPgLocator); }

    public void clickLatestNewsLink() {
        clickIt(latestNewsReopenedLinkLocator); }

    public boolean isNewsTitleDisplayed() {
        return isElementDisplayed(paraBankNewsTitleLocator); }


}
