package Pages;

import Helper.Date;
import Helper.Misc;
import org.openqa.selenium.By;

public class Date_08 extends Commands{


    By readMeBottomLocator = By.xpath("//p[@class='more']//following::a[text()='Read More']");
    By listedDateLocator = By.xpath("//li[@class='captionthree']");



    public boolean verifyReadMeEnabled () {
        return isElementEnabled(readMeBottomLocator);
    }

    public boolean verifyCurrentDateDisplayed () {
        String today = Date.getCurrentDate();
        String pageDate = getTextOfWebElement(listedDateLocator);
        return today.equals(pageDate);
    }


















}


