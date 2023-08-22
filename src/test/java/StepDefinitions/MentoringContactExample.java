package StepDefinitions;

import Pages.MentoringContact;
import Utilities.MyMethods;
import Utilities.ParameterDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MentoringContactExample extends MyMethods{

    MentoringContact mc = new MentoringContact();

    @Given("Navigate to Exercise Page")
    public void navigate_to_exercise_page() {
        ParameterDriver.getDriver().get("https://automationexercise.com/");

    }

    @Given("Click on the contact Us button")
    public void click_on_the_contact_us_button() {
        mc.clickMethod(mc.ContactusButton);
    }

    @Given("Fill the form with this data")
    public void fill_the_form_with_this_data(DataTable formvalues) {

        List<String> listdatas = formvalues.asList(String.class);  // formvalues.transforms yaparsan dikey tablo yataya doner.
        mc.sendKeysMethod(mc.formNameInput, listdatas.get(0));
        mc.sendKeysMethod(mc.formEmailInput, listdatas.get(1));
        mc.sendKeysMethod(mc.formSubjectInput, listdatas.get(2));
        mc.sendKeysMethod(mc.formMessageBox, listdatas.get(3));
        try {
            Thread.sleep(Duration.ofSeconds(2));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //ParameterDriver.getDriver().switchTo().alert().accept();



    }

    @Given("Click submit button")
    public void click_submit_button() {
        mc.clickMethod(mc.submitButton);
        ParameterDriver.getDriver().switchTo().alert().accept();
    }

    @Then("Verify form is submitted")
    public void verify_form_is_submitted() {
        //assertText(mc.successMessage,"successfully");
        //Assert.assertTrue(mc.successMessage.getText().contains("successfully"));
    }

}
