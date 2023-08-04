package Pages;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNullBar extends MyMethods {


    public LeftNullBar(){
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setUpButton;

    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
    public WebElement parametersButton;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countriesButton;








}

