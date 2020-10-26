package pageObjects;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseTest
{
    WebDriver driver;

    @FindBy(id = "gender-male") public WebElement maleRadioBtn;
    @FindBy(id = "gender-female") public WebElement   femaleRadioBtn;
    @FindBy(id = "FirstName") public WebElement  firstNameTextBox;
    @FindBy(id = "LastName") public WebElement  lastNameTextBox;
    @FindBy(xpath = "//input[@id='Email']") public WebElement emailTextBox;
    @FindBy(css = "input#Password") public WebElement passwordTextBox;
    @FindBy(css = "input#ConfirmPassword") public WebElement  confirmPasswordTextBox;
    @FindBy(id = "register-button") public WebElement RegisterBtn;
    @FindBy(xpath = "//div[text()='Your registration completed']") public WebElement actualRegConf;

    //@FindBy() public WebElement     ;

    public RegisterPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMaleRdioBtn()
    {
        maleRadioBtn.click();
    }
    public void clickFemaleRadioBtn()
    {
        femaleRadioBtn.click();
    }
    public void enterFirstName(String enterFN)
    {
        firstNameTextBox.sendKeys(enterFN);
    }
    public void enterLastName(String enterLN)
    {
        lastNameTextBox.sendKeys(enterLN);
    }
    public void enterEmailText(String enterEmail)
    {
        emailTextBox.sendKeys(enterEmail);
    }
    public void enterPassword(String enterPass)
    {
        passwordTextBox.sendKeys(enterPass);
    }
    public void enterConfirmPassword(String enterConfirmPass)
    {
        confirmPasswordTextBox.sendKeys(enterConfirmPass);
    }

    public void clickRegisterBtn()
    {
        RegisterBtn.click();
    }

    public String getActRegConf()
    {
        return actualRegConf.getText();
    }


}
