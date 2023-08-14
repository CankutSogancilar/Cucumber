package Pages;

import Utilities.BaseDriver;
//import io.cucumber.java.zh_cn.假如;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends MyMethods {


    public DialogContent(){
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@data-placeholder='Username']")
    public WebElement username;

    @FindBy(css = "input[data-placeholder='Password']")
    public WebElement password;

    @FindBy(xpath="//span[normalize-space()='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//span[normalize-space()='Dashboard']")
    public WebElement dashBoard;
    //(//div//span[normalize-space()='Dashboard'])[2]

    @FindBy(xpath = "//ms-add-button")
    public  WebElement addButton;

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






}
