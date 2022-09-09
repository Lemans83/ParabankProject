package Pages;

import org.openqa.selenium.By;

public class ForgotLogIn_09 extends Commands{

    By forgotLogInLocator = By.xpath("//a[text()='Forgot login info?']");
    By lookUpLocator = By.xpath("//div[@id='rightPanel']//following::p[contains(text(),'in order to validate your account.')]");
    By findMyLoginLocator = By.xpath("//div[@id='rightPanel']//following::input[@value='Find My Login Info']");
    By emptyFirstNameMsgLocator = By.xpath("//span[@id='firstName.errors']");
    By emptyLastNameMsgLocator = By.xpath("//span[@id='lastName.errors']");
    By emptyAddressMsgLocator = By.xpath("//span[@id='address.street.errors']");
    By emptyCityMsgLocator = By.xpath("//span[@id='address.city.errors']");
    By emptyStateMsgLocator = By.xpath("//span[@id='address.state.errors']");
    By emptyZipCodeMsgLocator = By.xpath("//span[@id='address.zipCode.errors']");
    By emptySSNMsgLocator = By.xpath("//span[@id='ssn.errors']");

    public void clickForgotLogInButton () {
        clickIt(forgotLogInLocator);
    }
    public boolean verifyLookUpTextDisplayed () {
        return isElementDisplayed(lookUpLocator);
    }
    public void clickFindMyLogInButton () {
        clickIt(findMyLoginLocator);
    }
    public boolean verifyFinfMyLogInEnabled () {
        return isElementEnabled(findMyLoginLocator);
    }
    public boolean verifyErrorMsgOnEmptyFirstNameDisplayed () {
        return isElementDisplayed(emptyFirstNameMsgLocator);
    }
    public boolean verifyErrorMsgOnEmptyLastNameDisplayed () {
        return isElementDisplayed(emptyLastNameMsgLocator);
    }
    public boolean verifyErrorMsgOnEmptyAddressDisplayed () {
        return isElementDisplayed(emptyAddressMsgLocator);
    }
    public boolean verifyErrorMsgOnEmptyCityDisplayed () {
        return isElementDisplayed(emptyCityMsgLocator);
    }
    public boolean verifyErrorMsgOnEmptyStateDisplayed () {
        return isElementDisplayed(emptyStateMsgLocator);
    }
    public boolean verifyErrorMsgOnEmptyZipCodeDisplayed () {
        return isElementDisplayed(emptyZipCodeMsgLocator);
    }
    public boolean verifyErrorMsgOnEmptySSNDisplayed () {
        return isElementDisplayed(emptySSNMsgLocator);
    }














}


