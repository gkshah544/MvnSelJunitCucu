package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.desktop.PreferencesEvent;

public class DriverFactory {

    private static WebDriver driver;

    public static  WebDriver getDriver(){

        if(driver == null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void closeDriver(){
        if(driver !=null){
            driver.close();
            driver=null;
        }

    }
}
