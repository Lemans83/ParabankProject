package Pages;

import org.openqa.selenium.By;

public class LoginInfoPage extends Commands {

//LOCATORS
//TC_03
    By forgotLogInfoLocator = By.xpath("//a[text()='Forgot login info?']");
    By verMessDisplayedLocator = By.xpath("//h1[@class='title']");
    By firstNameLocator = By.xpath("//input[@id='firstName']");
    By lastNameLocator = By.xpath("//input[@id='lastName']");
    By addressLocator = By.id("address.street");
    By addressCityLocator = By.xpath("//input[@id='address.city']");
    By addressStateLocator = By.xpath("//input[@id='address.state']");
    By zipCodeLocator = By.xpath("//input[@id='address.zipCode']");
    By ssnLocator = By.id("ssn");
    By findMyloginInfobutton = By.xpath("//input[@value='Find My Login Info']");
    By errorMessageLocator = By.xpath("//h1[@class='title']");

// METODS
//TC_03
    public void clickLogInfolink() {
        clickIt(forgotLogInfoLocator);
    }

    public boolean verCustLookUpDisplayed() {
        ;
        isElementDisplayed(verMessDisplayedLocator);
        return true;
    }

    public void addFirstName(String value) {
        //clickIt(firstNameLocator);
        type(firstNameLocator, value);
    }

    public void addLastName(String value) {
        type(lastNameLocator, value);
    }

    public void addAddress(String value) {
        type(addressLocator, value);
    }

    public void addCityAddress(String value) {
        type(addressCityLocator, value);
    }

    public void addStateAddress(String value) {
        type(addressStateLocator, value);
    }

    public void addZipCode(String value) {
        type(zipCodeLocator, value);
    }

    public void addSsnAddress(String value) {
        type(ssnLocator, value);
    }

    public void MyLoginInfoButton() {
        clickIt(findMyloginInfobutton);
    }

    public boolean errorMessageIsDisplayed() {
       return isElementDisplayed(errorMessageLocator);
    }

}
