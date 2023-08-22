package StepDefinitions;

import Pages.DialogContent;
import Utilities.ParameterDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();
    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        ParameterDriver.getDriver().get("https://test.mersys.io/");
    }
    @When("Enter username and password")
    public void enter_username_and_password() {

        dc.sendKeysMethod(dc.username,"turkeyts");
        dc.sendKeysMethod(dc.password,"TechnoStudy123");

    }
    @When("Click on Login Button")
    public void click_on_login_button() {
        dc.loginButton.click();
    }
    @Then("User should Login successfully")
    public void user_should_login_successfully() {
        //Assert.assertTrue(dc.dashBoard.getText().equalsIgnoreCase("Dashboard")); ---> It is also correct
        dc.assertText(dc.dashBoard,"Dashboard");
    }

}
