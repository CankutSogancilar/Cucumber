package Pages;


//import io.cucumber.java.zh_cn.假如;
import Utilities.MyMethods;
import Utilities.ParameterDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends MyMethods {


    public DialogContent() {
        PageFactory.initElements(ParameterDriver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//span[normalize-space()='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//span[normalize-space()='Dashboard']")
    public WebElement dashBoard;
    //(//div//span[normalize-space()='Dashboard'])[2]

    @FindBy(xpath = "//ms-add-button")
    public WebElement addButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement formNameInput;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    public WebElement formCodeInput;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    public WebElement searchNameInput;

    @FindBy(xpath = "//input[@data-placeholder='Code']")
    public WebElement deleteCode;

    @FindBy(xpath = "//span[text()='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//button[@color='warn']")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[normalize-space()='Delete']")
    public WebElement deleteConfirmButton;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    public WebElement shortName;

    @FindBy(xpath = "//button[@color='accent']")
    public WebElement editButton;

    @FindBy(xpath = "//input[@data-placeholder='Short Name']")
    public WebElement searchShortName;

    @FindBy(xpath = "//input[@data-placeholder='Integration Code']")
    public WebElement feeIntegrationCode;

    @FindBy(xpath = "(//input[@data-placeholder='Priority'])[2]")
    public WebElement feePriority;

    @FindBy(xpath = "//ms-dialog-buttons")
    public WebElement Clicksomewhere;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement createExamName;

    @FindBy(xpath = "(//span[text()='Academic Period'])[1]")
    public WebElement academicPeriod;

    @FindBy(xpath = "//span[normalize-space()='Staj 2023']")
    public WebElement academicPeriodOption;

    @FindBy(xpath = "(//span[text()='Grade Level'])[1]") //
    public WebElement gradeLevel;

    @FindBy(xpath = "//span[normalize-space()='bALAYPn']")
    public WebElement gradeLevelOption;

    @FindBy(xpath = "//span[text()='Description']")
    public WebElement examDescription;

    @FindBy(xpath = "//span[text()='Notes']")
    public WebElement examNotes;

    @FindBy(css="body[id='tinymce']>p")
    public WebElement descriptionAndNoteText;

    @FindBy(xpath = "//iframe[@class='tox-edit-area__iframe']")
    public WebElement iFrame;

    @FindBy(xpath = "(//span[normalize-space()='Save & Close'])[1]")
    public WebElement feeSaveButton;

    @FindBy(xpath = "//tbody[@role='rowgroup']//td[2]")
    public List<WebElement> statesList;






}
