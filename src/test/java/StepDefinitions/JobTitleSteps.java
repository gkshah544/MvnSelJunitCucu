package StepDefinitions;

import Pages.JobTitlePage;
import Pages.LoginPage;
import Utilities.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class JobTitleSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    JobTitlePage jobTitle = new JobTitlePage(driver);



    @When("user click on admin tab and job and job title")
    public void user_click_on_admin_tab_and_job_and_job_title() throws InterruptedException {
      jobTitle.jobTitlePageOnly();
      Thread.sleep(3000);
    }

    @Then("user validates {string} header on the page")
    public void user_validates_header_on_the_page(String string) {
     jobTitle.JobTitleVerification(string);
    }
}
