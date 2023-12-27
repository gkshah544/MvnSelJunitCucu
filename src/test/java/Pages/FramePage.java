package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage {
    public FramePage(WebDriver driver){

        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//*[text()='Frames']") public WebElement frames;
    @FindBy(xpath = "//*[text()='Nested Frames']") public WebElement nestEdWebElement;


    public void frameOnHandle(){
        frames.click();
        nestEdWebElement.click();
    }
}
