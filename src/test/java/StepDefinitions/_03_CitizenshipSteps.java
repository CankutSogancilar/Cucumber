package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNullBar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_CitizenshipSteps {

    LeftNullBar lb=new LeftNullBar();
    DialogContent dc= new DialogContent();
    @And("Navigate to Citizenship page")
    public void navigateToCitizenshipPage() {

        lb.clickMethod(lb.setUpButton);
        lb.clickMethod(lb.parametersButton);
        lb.clickMethod(lb.citizenshipButton);


    }

    @Then("Enter {string} as citizenship name and {string} as short name")
    public void enterAsCitizenshipNameAndAsShortName(String citizenshipName, String citizenshipShortName) {
        dc.sendKeysMethod(dc.formNameInput, citizenshipName);
        dc.sendKeysMethod(dc.shortName,citizenshipShortName);


    }

    @And("Search for citizenship with the name {string} and shortname {string}")
    public void searchForCitizenshipWithTheNameAndShortname(String citizenshipName, String citizenshipShortName) {
        dc.sendKeysMethod(dc.searchNameInput,citizenshipName);
        dc.sendKeysMethod(dc.searchShortName,citizenshipShortName);
        dc.clickMethod(dc.searchButton);


    }

    @When("Delete citizenship")
    public void deleteCitizenship() {
        dc.wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//button[@color='warn']"), 1));
        dc.clickMethod(dc.deleteButton);
        dc.clickMethod(dc.deleteConfirmButton);

    }
}
