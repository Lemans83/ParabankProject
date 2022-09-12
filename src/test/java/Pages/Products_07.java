package Pages;

import Helper.Misc;
import org.openqa.selenium.By;

public class Products_07 extends Commands {


    By productsLocator = By.xpath("//ul[@class='leftmenu']//a[text()='Products']");
    By innovationTextLocator = By.xpath("//h1[text()='Innovative and Intelligent Software Testing Platform']");
    By seeInActionLocator = By.xpath("//div[@class='inner-banner-btn']//following::div[@class='btn-list']//following::a[@title='Request a Demo']");

    public void clickProducts () {

        clickIt(productsLocator);
        Misc.pause(2);
    }
    public boolean verifyTextIsDisplayed () {
        return isElementDisplayed(innovationTextLocator);
    }
    public boolean verifySeeInActionIsEnabled () {
        scrollToElementIntoView(seeInActionLocator);
        return isElementEnabled(seeInActionLocator);
    }



}





