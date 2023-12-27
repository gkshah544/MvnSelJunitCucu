package StepDefinitions;
import Pages.AlertPage;
import Utilities.DriverFactory;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertPageSteps {
   WebDriver driver = DriverFactory.getDriver();
   WebDriverWait wait;
   AlertPage alertPage = new AlertPage(driver);

    @Given("uses navigates to demoqa website")
    public void uses_navigates_to_demoqa_website() {
        driver.get("https://demoqa.com/alerts");
    }



    @Then("clicks on {string} alert page")
    public void clicks_on_alert_page(String clicks) {
      alertPage.generalAlertClicking(clicks);
    }

    @Then("user should able to {string} the pop up alert page")
    public void user_should_able_to_the_pop_up_alert_page(String string) {
      alertPage.generalAlertHandling(string);
    }
}
