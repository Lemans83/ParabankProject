package Pages;

import org.openqa.selenium.By;

public class Products_7 extends Commands {

    //By productsLocator = By.xpath("(//a[text()='Products'])[1]");
    By productsLocator = By.xpath("//ul[@class='leftmenu']//a[text()='Products']");
    By innovationTextLocator = By.xpath("//h1[text()='Innovative and Intelligent Software Testing Platform']");
    By seeInActionLocator = By.xpath("//a[text()='See It in Action']");

    public void clickProducts () {
        clickIt(productsLocator);
    }
    public boolean verifyTextIsDisplayed () {
        return isElementDisplayed(innovationTextLocator);
    }
    public boolean verifySeeInActionIsEnabled () {
        return isElementEnabled(seeInActionLocator);
    }



}





