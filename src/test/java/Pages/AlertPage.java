package Pages;

import Utilities.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;

public class AlertPage {
    WebDriverWait wait;
    WebDriver driver = DriverFactory.getDriver();
    public  AlertPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='timerAlertButton']") public WebElement secondAlertBtn;
    @FindBy(xpath = "//*[@id='confirmButton']") public WebElement thirdAlertBtn;
    @FindBy(xpath = "//*[@id='promtButton']") public WebElement promtAlertBtn;



    public void alertHandling(){
        secondAlertBtn.click();
    }

    public void generalAlertClicking(String buttons){
        switch (buttons){
            case "secondBtn":
                secondAlertBtn.click();
                wait = new WebDriverWait(driver,10);
                wait.until(ExpectedConditions.alertIsPresent());
                break;
            case "ThirdBtn":
                thirdAlertBtn.click();
                wait = new WebDriverWait(driver,10);
                wait.until(ExpectedConditions.alertIsPresent());
                break;
            case "FourthBtn":
                promtAlertBtn.click();
                wait = new WebDriverWait(driver,10);
                wait.until(ExpectedConditions.alertIsPresent());
                break;
        }
    }
    public void generalAlertHandling(String handleOn){
       switch (handleOn){
           case "acknowledge":
               Alert myalert = driver.switchTo().alert();
               myalert.accept();
               break;

           case "dismiss":
               Alert thirdAlert = driver.switchTo().alert();
               thirdAlert.dismiss();
               break;

           case "keywords":
               Alert promtalert = driver.switchTo().alert();
               promtalert.sendKeys("passed");
               break;
       }
    }

}
