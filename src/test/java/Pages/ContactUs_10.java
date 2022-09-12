package Pages;

import Helper.Misc;
import org.openqa.selenium.By;

public class ContactUs_10 extends Commands {

    By locationsLocator = By.xpath("//ul[@class='leftmenu']//a[text()='Locations']");
    By acceptCookiesLocator = By.xpath("//a[@id='hs-eu-confirmation-button']");
    By parasoftContinuousTextLocator = By.xpath("//div[@class='inner-banner-cont']//h1[contains(text(),'The Parasoft Continuous Quality Platform:')]");
    By exploreButtonLocator = By.xpath("//a[text()='Explore Products']");
    By contactUsButtonLocator = By.xpath("//div[@class='inner-banner-cont']//following::div[@class='inner-banner-btn']//following::a[text()='Contact Us']");
    By contactUsTextLocator = By.xpath("//strong[contains(text(),'Contact us to learn how Parasoft’s automated software testing solutions can help')]");
    By emailLocator = By.xpath("//input[@id='email-7e18a454-1995-49f5-a907-ddc7be450646']");
    By firstNameLocator = By.xpath("//input[@id='firstname-7e18a454-1995-49f5-a907-ddc7be450646']");
    By lastNameLocator = By.xpath("//input[@id='lastname-7e18a454-1995-49f5-a907-ddc7be450646']");
    By companyLocator = By.xpath("//input[@id='company-7e18a454-1995-49f5-a907-ddc7be450646']");
    By jobTitleLocator = By.xpath("//input[@id='jobtitle-7e18a454-1995-49f5-a907-ddc7be450646']");
    By phonNumLocator = By.xpath("//input[@id='phone-7e18a454-1995-49f5-a907-ddc7be450646']");
    By selectCountryLocator = By.xpath("//select[@id='country-7e18a454-1995-49f5-a907-ddc7be450646']");
    By commentsLocator = By.xpath("//textarea[@id='comments-7e18a454-1995-49f5-a907-ddc7be450646']");
    By contactRedButtonLocator = By.xpath("//input[@type='submit']");
    By thankYouLocator = By.xpath("//div[@class='content']//following::h2[text()='Thank You!']");

    public void clickLocations () {
        clickIt(locationsLocator);
        Misc.pause(5);
    }
    public boolean verifyQualityPlatformDisplayed () {
       return isElementDisplayed(parasoftContinuousTextLocator);
    }

    public boolean verifyExploreParasoftEnabled () {
        return isElementEnabled(exploreButtonLocator);
    }
    public void clickExploreButton () {
        clickIt(exploreButtonLocator);
        Misc.pause(2);
    }
    public void clickContactUs () {
        clickIt(contactUsButtonLocator);
    }
    public boolean verifyContactUsTextDisplayed() {
        return isElementDisplayed(contactUsTextLocator);
    }
    public void typeEmail (String email) {
        Misc.pause(2);
        type(emailLocator,email);
    }
    public void dismissCookies () {
        clickIt(acceptCookiesLocator);
    }
    public void typeFirstName (String firstName) {
        type(firstNameLocator,firstName);
        Misc.pause(2);

    }
    public void typeLastName (String lastName) {
        type(lastNameLocator,lastName);
        Misc.pause(2);
    }
    public void typeCompanyName (String companyName) {
        type(companyLocator,companyName);
        Misc.pause(2);
    }
    public void typeJobTitle (String jobName) {
        type(jobTitleLocator,jobName);
        Misc.pause(2);
    }
    public void typePhone (String phoneNum) {
        type(phonNumLocator,phoneNum);
        Misc.pause(2);
    }
    public void selectCountry (String countryName ) {
        selectInDropdown(selectCountryLocator,countryName);
        Misc.pause(2);
    }

    public void typeComments (String yourComment) {
        type(commentsLocator,yourComment);
        Misc.pause(2);
    }
    public void clickContactButton () {
        clickIt(contactRedButtonLocator);
        Misc.pause(2);
    }
    public boolean verifyThankYouTextDisplayed () {
        return isElementDisplayed(thankYouLocator);
    }




}
