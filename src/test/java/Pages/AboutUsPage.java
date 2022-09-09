package Pages;

import org.openqa.selenium.By;

public class AboutUsPage extends Commands {
//TC_04
//LOCATORS
    By aboutUsLocator = By.xpath("(//a[text()='About Us'])[1]");
    By clickWebsiteLocator = By.xpath("(//a[text()='www.parasoft.com'])[1]");
    By scrollDownLocator = By.xpath("(//div[@class='heading']/h2)[1]");
    By acceptCookiesLocator = By.xpath("//a[@id='hs-eu-confirmation-button']");

//METHODS
    public void clickAboutUs(){
        clickIt(aboutUsLocator);
    }
    public void clickWebsiteLink(){
        clickIt(clickWebsiteLocator);
    }
    public void acceptCookies(){
        clickIt(acceptCookiesLocator);
    }
    public void scrollDown(){
        scrollToElementIntoView(scrollDownLocator);
    }
    public boolean parasoftContniuousQualityDisplayed(){
       return  isElementDisplayed(scrollDownLocator);
    }






}