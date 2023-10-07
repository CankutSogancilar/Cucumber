package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNullBar;
import Utilities.DBUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _09_JDBCSteps {
    LeftNullBar lb = new LeftNullBar();
    DialogContent dc = new DialogContent();

    @Given("Navigate to States pages")
    public void navigateToStatesPages() {
        lb.clickMethod(lb.setUpButton);
        lb.clickMethod(lb.parametersButton);
        lb.clickMethod(lb.statesButton);
    }

    List<List<String>> dataFromDatabase;

    @When("Send the query {string}")
    public void sendTheQuery(String query) {
        dataFromDatabase = DBUtilities.getData(query);

    }

    @Then("check if they match with the names on the UI")
    public void checkIfTheyMatchWithTheNamesOnTheUI() {
        List<WebElement> statesListFromUI = dc.statesList;
        for(int i=0;i<statesListFromUI.size();i++){

            Assert.assertEquals(dataFromDatabase.get(i).get(0),statesListFromUI.get(i).getText());
        }
    }
}
