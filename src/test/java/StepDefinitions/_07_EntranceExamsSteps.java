package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNullBar;
import Utilities.BaseDriver;
import Utilities.ParameterDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _07_EntranceExamsSteps {
    LeftNullBar lb = new LeftNullBar();
    DialogContent dc = new DialogContent();

    @And("Go to Entrance Exams page")
    public void goToEntranceExamsPage() {
        lb.clickMethod(lb.entranceExamsButton1);
        lb.clickMethod(lb.entranceExamsSetupButton);
        lb.clickMethod(lb.entranceExamsButton2);
    }

    @And("Fill the Create Exam Form with")
    public void fillTheCreateExamFormWith(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.sendKeysMethod(dc.createExamName, dataList.get(0));
        dc.clickMethod(dc.academicPeriod);
        dc.clickMethod(dc.academicPeriodOption);
        dc.clickMethod(dc.gradeLevel);
        dc.clickMethod(dc.gradeLevelOption);


    }

    @And("Create a description")
    public void createADescription(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);

        dc.clickMethod(dc.examDescription);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.iFrame));
        ParameterDriver.getDriver().switchTo().frame(0);
        dc.sendKeysMethod(dc.descriptionAndNoteText, dataList.get(0));
        BaseDriver.getDriver().switchTo().defaultContent();

    }

    @And("Create a note")
    public void createANote(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.clickMethod(dc.examNotes);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.iFrame));
        ParameterDriver.getDriver().switchTo().frame(0);
        dc.sendKeysMethod(dc.descriptionAndNoteText, dataList.get(0));
        ParameterDriver.getDriver().switchTo().defaultContent();
    }
}
