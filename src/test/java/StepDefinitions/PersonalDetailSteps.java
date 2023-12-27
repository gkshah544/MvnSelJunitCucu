package StepDefinitions;

import Pages.AddEmployee;
import Pages.LoginPage;
import Utilities.DriverFactory;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class PersonalDetailSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    AddEmployee addEmployee= new AddEmployee(driver);


    @Given("I’m logged in to HRM with Admin Account")
    public void i_m_logged_in_to_HRM_with_Admin_Account() {
        driver.get("http://dev-hrm.yoll.io/index.php/auth/login");
        loginPage.login("yoll-student","Bootcamp5#");
    }

    @Given("I click on PIM → Add Employee")
    public void i_click_on_PIM_Add_Employee() throws InterruptedException {
    addEmployee.addEmployeePage();

    }

    @Then("I fill out First Name, Middle Name, Last Name")
    public void i_fill_out_First_Name_Middle_Name_Last_Name() throws InterruptedException {
     addEmployee.fillUpDetails();
    }

    @Then("I verify Employee number is not empty")
    public void i_verify_Employee_number_is_not_empty() throws InterruptedException {
      addEmployee.verifyEmpId();
    }

    @Then("I click on Save")
    public void i_click_on_Save() {
     addEmployee.submitForm();
    }

    @Then("I verify new account got created with correct details")
    public void i_verify_new_account_got_created_with_correct_details() {
      DriverFactory.closeDriver();
    }

}
