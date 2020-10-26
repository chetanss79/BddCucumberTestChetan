package pageObjects;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest
{
    WebDriver driver;

    @FindBy(id = "Email") public WebElement emailTextBox;
    @FindBy(id = "Password") public WebElement passwordTextBox;
    @FindBy(xpath = "//input[@class='button-1 login-button']") public WebElement logInButton;
    @FindBy(xpath = "//h2[text()='Welcome to our store']") public WebElement actualWelcome;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void ennterEmailText(String enterEM)
    {
        emailTextBox.sendKeys(enterEM);
    }

    public void enterPass (String enterPW)
    {
        passwordTextBox.sendKeys(enterPW);
    }
    public void clickLIBtn()
    {
        logInButton.click();
    }
    public String getActualWelcomeText()
    {
        return actualWelcome.getText();
    }
}
