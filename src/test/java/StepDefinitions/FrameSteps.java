package StepDefinitions;
import Pages.FramePage;
import Utilities.DriverFactory;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameSteps {

    WebDriver driver = DriverFactory.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);

    FramePage framePage = new FramePage(driver);

    @Given("user able to navigate to herokuapp page")
    public void user_able_to_navigate_to_herokuapp_page() {
     driver.get("https://the-internet.herokuapp.com");
    }

    @When("user clicks on frames and nested frames tab")
    public void user_clicks_on_frames_and_nested_frames_tab() {
      framePage.frameOnHandle();
    }

    @Then("user should able switch innerr to outer tabs and vice versa")
    public void user_should_able_switch_innerr_to_outer_tabs_and_vice_versa() throws InterruptedException {

     driver.switchTo().defaultContent();
     driver.switchTo().parentFrame();

     WebElement innderFrame=driver.findElement(By.xpath("//*[@name='frame-top']"));
     driver.switchTo().frame(innderFrame);

     WebElement innderleft=driver.findElement(By.xpath("//*[@name='frame-left']"));
     driver.switchTo().frame(innderleft);

    }

    @Then("able to print text from left frame in console")
    public void able_to_print_text_from_left_frame_in_console() throws InterruptedException {
    WebElement textLeft =driver.findElement(By.xpath("//*[text()='LEFT']"));
    String valueText =textLeft.getText();
        System.out.println("desired text is: "+valueText);
    Thread.sleep(2000);
    DriverFactory.closeDriver();
    }


}
