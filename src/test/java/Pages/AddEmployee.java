package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee {
    public AddEmployee(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[text()='PIM']") public WebElement pimBtn;
    @FindBy(xpath = "//*[@id='btnAdd']") public WebElement addBtn;
    @FindBy(xpath = "//*[@id='firstName']") public WebElement firstName;
    @FindBy(xpath = "//*[@id='lastName']") public WebElement lastName;
    @FindBy(xpath = "//*[@id='employeeId']") public WebElement employeeId;
    @FindBy(xpath = "//*[@id='btnSave']") public WebElement buttanSave;




    public void addEmployeePage() throws InterruptedException {
        pimBtn.click();
        addBtn.click();
        Thread.sleep(3000);
    }

    public void fillUpDetails() throws InterruptedException {
        firstName.sendKeys("ranjit");
        lastName.sendKeys("shah");
        Thread.sleep(3000);
    }
    public void verifyEmpId() throws InterruptedException {
        String empId = employeeId.getText();
        boolean isChecked = empId.isEmpty();
        Assert.assertTrue(isChecked);
        Thread.sleep(2000);
    }
    public void submitForm(){
        buttanSave.click();
    }
}
