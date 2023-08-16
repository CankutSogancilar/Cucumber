package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class _04_DataTableSteps {
    @Given("Go to the WebPage")
    public void goToTheWebPage() {
        System.out.println("We are on the WebPage");
    }

    @And("Fill the form with valid data")
    public void fillTheFormWithValidData(DataTable formInfo) {
        List<String> formInfoList=formInfo.asList(String.class);
        System.out.println(formInfoList.get(0));
        System.out.println(formInfoList.get(1));
        System.out.println(formInfoList.get(2));
        System.out.println(formInfoList.get(3));
    }

    @Then("Save the form")
    public void saveTheForm() {
        System.out.println("Form is saved");
    }

    @And("Enter valid information")
    public void enterValidInformation(DataTable formInfo) {
        List<List<String>> formInfoList2D =formInfo.asLists(String.class);

        for(List<String>list:formInfoList2D){
            System.out.println(list.get(0)+"="+list.get(1));
        }
    }
}
