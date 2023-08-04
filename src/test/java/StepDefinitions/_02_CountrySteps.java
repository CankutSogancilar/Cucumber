package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNullBar;
import Utilities.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _02_CountrySteps {
    DialogContent dc=new DialogContent();
    LeftNullBar lb=new LeftNullBar();

    WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(10));
    @And("Navigate to Country page")
    public void navigateToCountryPage() {
        lb.clickMethod(lb.setUpButton);
        lb.clickMethod(lb.parametersButton);
        lb.clickMethod(lb.countriesButton);
    }

    @When("Create a new country")
    public void createANewCountry() {
        dc.clickMethod(dc.addButton);
        dc.sendKeysMethod(dc.formNameInput,"B1741");
        dc.sendKeysMethod(dc.formCodeInput,"dwfwfairy1tbcnv");
        dc.clickMethod(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(dc.successMessage));
        Assert.assertTrue(dc.successMessage.isDisplayed());
    }
}
