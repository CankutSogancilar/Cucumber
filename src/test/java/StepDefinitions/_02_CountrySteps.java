package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNullBar;
import Utilities.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class _02_CountrySteps {
    DialogContent dc = new DialogContent();
    LeftNullBar lb = new LeftNullBar();


    @And("Navigate to Country page")
    public void navigateToCountryPage() {
        lb.clickMethod(lb.setUpButton);
        lb.clickMethod(lb.parametersButton);
        lb.clickMethod(lb.countriesButton);
    }

    @When("Create a new country")
    public void createANewCountry() {
        dc.clickMethod(dc.addButton);
        dc.sendKeysMethod(dc.formNameInput, "eda98888888889");
        dc.sendKeysMethod(dc.formCodeInput, "BTC88");
        dc.clickMethod(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.assertText(dc.successMessage, "successfully");
    }

    @And("Delete a country")
    public void deleteACountry() {
        dc.sendKeysMethod(dc.searchNameInput, "eda98888888889");
        dc.sendKeysMethod(dc.deleteCode, "BTC88");
        dc.clickMethod(dc.searchButton);

        //try {
        //      Thread.sleep(3000);
        //   } catch (InterruptedException e) {
        //       throw new RuntimeException(e);
        // }

        dc.wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//button[@color='warn']"), 1));
        dc.clickMethod(dc.deleteButton);
        dc.clickMethod(dc.deleteConfirmButton);


    }
}
