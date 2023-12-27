package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//*[text()='Welcome Yoll']") public WebElement welcomeElement;
    public void verifyWelcome(String expectedMessage) throws InterruptedException {
        String actualValue = welcomeElement.getText();
        System.out.println(" xxxx00xxx "+ welcomeElement.getText());
        System.out.println("expected value"+ expectedMessage);
        Assert.assertEquals("test has failed",expectedMessage,actualValue);
        Thread.sleep(2000);
    }
}
