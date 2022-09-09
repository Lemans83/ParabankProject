package Pages;

import Web.MyDriver;
import org.openqa.selenium.By;

public class LoginPage extends Commands {

 //LOCATORS
 // TC_01
   By username = By.xpath("//input[@name='username']");
   By password = By.xpath("//input[@name='password']");
   By logInButton = By.xpath("//input[@value='Log In']");
   By titleMessageDisplayed = By.xpath("//h1[@class='title']");

 // TC_02
   By invalidusername = By.xpath("//input[@name='username']");
   By invalidpassword = By.xpath("//input[@name='password']");
   By errorMessageDisplayed = By.xpath("//p[@class='error']");

 // METHODS
 // TC 01
   public void myUsername(String value){
       type(username,value);
    }
   public void myPassword (String value) {
      type(password,value);
   }
   public void clickLoginBtn(){
      clickIt(logInButton);
   }

   public boolean verTitleMessageIsDisplayed(){
    return isElementDisplayed(titleMessageDisplayed);
   }

// TC_02
   public void uernameIsInvalid (String value){
      type(invalidusername, value);
   }

    public void passwordIsInvalid (String value){
        type(invalidpassword, value);
    }
   public boolean errorMessageIsDisplayed(){
      return isElementDisplayed(errorMessageDisplayed);
   }



}











