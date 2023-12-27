package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);}


    @FindBy(xpath = "//*[@id='txtUsername']") public WebElement userNameInput;
    @FindBy(xpath = "//*[@id='txtPassword']") public WebElement userPassword;
    @FindBy(xpath = "//*[@id='btnLogin']") public WebElement loginBtn;
    @FindBy(xpath = "//*[text()='Invalid credentials']" ) public WebElement errorMessageInvalid;
    @FindBy(xpath = "//*[text()='Username cannot be empty']") public WebElement actualEmptyUserNameMessage;
    @FindBy(xpath = "//*[text()='Password cannot be empty']") public WebElement actualEmptyPasswordMessage;



    public void login(String userName, String password){
      userNameInput.sendKeys(userName);
      userPassword.sendKeys(password);
      loginBtn.click();
    }

    public void verifyErrorMessage( String expectedErrorMessage) throws InterruptedException {
      String actualIvalidCreMessage = errorMessageInvalid.getText();
      String actualEmptyUserName =actualEmptyUserNameMessage.getText();
      String actualEmplyPassowrd = actualEmptyPasswordMessage.getText();

      if(expectedErrorMessage=="Invalid credentials"){
       Assert.assertEquals("Invalid credential test failed",expectedErrorMessage,actualIvalidCreMessage);
      }
     if(expectedErrorMessage=="Username cannot be empty"){
         Assert.assertEquals("Empty username test failed",expectedErrorMessage,actualEmptyUserName);
     }
        if(expectedErrorMessage=="Password cannot be empty"){
            Assert.assertEquals("Empty Password test failed",expectedErrorMessage,actualEmplyPassowrd);
        }


    }

}
