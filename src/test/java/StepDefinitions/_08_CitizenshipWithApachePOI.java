package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class _08_CitizenshipWithApachePOI {
    @When("Create a citizenship with Apache POI")
    public void createACitizenshipWithApachePOI() {
       ArrayList<ArrayList<String>> citizenShipData=ExcelUtilities.getDataFromExel("src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx","testCitizen",2);

        DialogContent dc=new DialogContent();

        for (int i = 0; i < citizenShipData.size(); i++) {
            dc.clickMethod(dc.addButton);
            dc.sendKeysMethod(dc.formNameInput,citizenShipData.get(i).get(0));
            dc.sendKeysMethod(dc.shortName,citizenShipData.get(i).get(1));
            dc.clickMethod(dc.saveButton);
            dc.assertText(dc.successMessage,"successfully");
            dc.wait.until(ExpectedConditions.visibilityOf(dc.successMessage));
        }

    }
}
