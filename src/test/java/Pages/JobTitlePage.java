package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobTitlePage {
    public JobTitlePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='menu_admin_viewAdminModule']") public WebElement adminElement;
    @FindBy(xpath = "//*[@id='menu_admin_Job']") public WebElement jobPageElement;
    @FindBy(xpath = "//*[@id='menu_admin_viewJobTitleList']") public WebElement SubJobTitleTab;
    @FindBy(xpath = "//*[@id='search-results']/div/h1") public WebElement textHeaderJobHeader;

    public  void jobTitlePageOnly() throws InterruptedException {
        adminElement.click();
        Thread.sleep(3000);
        jobPageElement.click();
        Thread.sleep(3000);
        SubJobTitleTab.click();
        Thread.sleep(3000);
    }
    public void JobTitleVerification(String expectedString){
        String actualMessage = textHeaderJobHeader.getText();
        Assert.assertEquals("Job Title test failed",expectedString, actualMessage);
    }

}
