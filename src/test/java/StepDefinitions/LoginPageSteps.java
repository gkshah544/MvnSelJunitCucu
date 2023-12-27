package StepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import Utilities.DriverFactory;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;


public class LoginPageSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    @Given("users navigates to hrm login page")
    public void users_navigates_to_hrm_login_page() {
     driver.get("http://dev-hrm.yoll.io/");
    }

    @When("users enters {string} and {string} and clicks login button")
    public void users_enters_and_and_clicks_login_button(String string, String string2) throws InterruptedException {
      loginPage.login(string,string2);
      Thread.sleep(2000);
    }

    @Then("user should Validates {string} in login page")
    public void user_should_Validates_in_login_page(String expectedErrorMessage) throws InterruptedException {
       loginPage.verifyErrorMessage(expectedErrorMessage);
       Thread.sleep(5000);
    }

    @Then("user should able verify HRM homepage with {string} header on page")
    public void user_should_able_verify_HRM_homepage_with_header_on_page(String string) throws InterruptedException {

        homePage.verifyWelcome(string);
        DriverFactory.closeDriver();
    }

}
