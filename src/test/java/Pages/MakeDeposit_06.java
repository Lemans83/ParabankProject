package Pages;

import org.openqa.selenium.By;

public class MakeDeposit_06 extends Commands {


    By makeDepositLocator = By.xpath("//a[text()='Make Deposits']");

    public boolean isMakeDepositButtonEnabled() {
        return isElementEnabled(makeDepositLocator);

    }


}


