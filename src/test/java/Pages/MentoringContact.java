package Pages;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import Utilities.ParameterDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MentoringContact extends MyMethods {
    public MentoringContact() {
        PageFactory.initElements(ParameterDriver.getDriver(),this);
    }
    @FindBy(xpath = "//li//a[normalize-space()='Contact us']")
    public WebElement ContactusButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement formNameInput;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement formEmailInput;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    public WebElement formSubjectInput;

    @FindBy(id="message")
    public WebElement formMessageBox;

    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement successMessage;
}
