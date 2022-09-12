package Web;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MyDriver {

    private static WebDriver driver;

    public static void launchUrlOnNewWindow(String url) {
//        Logger log = Logger.getLogger(MyDriver.class);
//
//        String sauceUrl = "https://oauth-mkarimovr-4cc8c:add4b24d-ff48-4933-a90b-0f9d545a3876@ondemand.us-west-1.saucelabs.com:443/wd/hub";
//        DesiredCapabilities caps = DesiredCapabilities.chrome();
//        caps.setCapability("version", "latest");
//        caps.setCapability("platform","windows 10");
//        try {
//            driver = new RemoteWebDriver(new URL(sauceUrl), caps);
//        } catch (MalformedURLException e){
//            e.printStackTrace();
//        }
//        driver.get(url);
//    }


        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        try {
           Thread.sleep(5000);
        } catch (InterruptedException e) {
           e.printStackTrace();
      }

    }

    public static void quitWindows() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}