package Pages;

import Utilities.MyMethods;
import Utilities.ParameterDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNullBar extends MyMethods {


    public LeftNullBar(){
        PageFactory.initElements(ParameterDriver.getDriver(),this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setUpButton;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    public WebElement parametersButton;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countriesButton;

    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenshipButton;

    @FindBy(xpath = "//span[text()='Fees']")
    public WebElement feeStep;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    public WebElement entranceExamsButton1;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    public WebElement entranceExamsSetupButton;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    public WebElement entranceExamsButton2;

    @FindBy(xpath = "(//span[text()='States'])[1]")
    public WebElement statesButton;













}


