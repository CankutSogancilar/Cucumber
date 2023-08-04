package Pages;

import Utilities.BaseDriver;
//import io.cucumber.java.zh_cn.假如;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends MyMethods {


    public DialogContent(){
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@data-placeholder='Username']")
    public WebElement username;

    @FindBy(css = "input[data-placeholder='Password']")
    public WebElement password;

    @FindBy(css="span[class='mat-button-wrapper']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//span[normalize-space()='Dashboard']")
    public WebElement dashBoard;

    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    public  WebElement addButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    public WebElement formNameInput;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    public WebElement formCodeInput;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;





}
