package pageObjects;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest
{
    WebDriver driver;

    @FindBy(linkText = "Register") public WebElement registerLink;

    @FindBy(linkText = "Log in") public WebElement loginLink;

    @FindBy(css = "a.ico-logout") public WebElement logoutLink;

    @FindBy(className = "ico-wishlist") public WebElement wishListLink;

    @FindBy(className = "ico-cart") public WebElement shoppingCartLink;

    @FindBy(id = "small-searchterms") public WebElement searchTextBox;

    @FindBy(className = "button-1 search-box-button") public WebElement searchButton;

    @FindBy(linkText = "Computers") public WebElement CompButton;

    @FindBy(linkText = "Desktops") public WebElement DesktopButton;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickRegisterLink()
    {
        registerLink.click();
    }

    public void clickLogInLink()
    {
        loginLink.click();
    }

    public void clickwishListLink()
    {
        wishListLink.click();
    }

    public void clickshoppingCartLink()
    {
        shoppingCartLink.click();
    }

    public void enterSearchTextBox(String enterSTB)
    {
        searchTextBox.sendKeys(enterSTB);
    }
    public void clicksearchButton()
    {
        searchButton.click();
    }

    public void clickLogoutLink()
    {
        logoutLink.click();
    }

    public void navigateToUrl(String url)
    {
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    public void hooverOnComp()
    {
        Actions a = new Actions(driver);
        a.moveToElement(CompButton).perform();
    }

    public void clickDesktopBtn()
    {
        DesktopButton.click();
    }

}
