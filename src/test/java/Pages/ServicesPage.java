package Pages;

import org.openqa.selenium.By;

public class ServicesPage extends Commands {

//TC_05
//LOCATORS
 By servicesLocator = By.xpath("(//a[text()='Services'])[1]");
 By soapHeadingLocator = By.xpath("(//span[@class='heading'])[1]");
 By parabankServicesLocator = By.xpath("(//span[@class='heading'])[4]");


//METHODS
 public void clickServices(){
     clickIt(servicesLocator);
 }
 public boolean veriSoapHeadingMessageDisplayed(){
     return isElementDisplayed(soapHeadingLocator);
 }
 public void scrollDowntoElement(){
     scrollToElementIntoView(parabankServicesLocator);
    }
 public boolean verParabankServiceIsDisplayed(){
     return isElementDisplayed(parabankServicesLocator);
 }











}
