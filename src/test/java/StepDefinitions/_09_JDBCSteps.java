package StepDefinitions;

import Utilities.DBUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _09_JDBCSteps {
    @Given("Navigate to States pages")
    public void navigateToStatesPages() {
    }

    @When("Send the query {string}")
    public void sendTheQuery(String query) {
        DBUtilities.getData(query);
    }

    @Then("check if they match with the names on the UI")
    public void checkIfTheyMatchWithTheNamesOnTheUI() {
    }
}
