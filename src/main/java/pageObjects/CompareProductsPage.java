package pageObjects;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareProductsPage extends BaseTest
{
    WebDriver driver;

    @FindBy(xpath = "//a[text()='Digital Storm VANQUISH 3 Custom Performance PC']") public WebElement DigiStormProduct1;
    @FindBy(xpath = "//a[text()='Build your own computer']") public WebElement BuildOwnCompProduct2;
    @FindBy(xpath = "//td[text()='$1,259.00']") public WebElement priceOfPro1;
    @FindBy(xpath = "//td[text()='$1,200.00']") public WebElement priceOfPro2;


    public CompareProductsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getProduct1()
    {
        return DigiStormProduct1.getText();
    }
    public String getProduct2()
    {
        return BuildOwnCompProduct2.getText();
    }

    public String getPrice1()
    {
        return priceOfPro1.getText();
    }
    public String getPrice2()
    {
        return priceOfPro2.getText();
    }
}
