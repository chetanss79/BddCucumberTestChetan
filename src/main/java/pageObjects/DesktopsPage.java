package pageObjects;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends BaseTest
{
    WebDriver driver;
    @FindBy(xpath = "(//input[@class='button-2 add-to-compare-list-button'])[1]") public WebElement Pro1;
    //@FindBy(css = "p.content") public WebElement ProAdd1Text;
    @FindBy(xpath = "(//input[@class='button-2 add-to-compare-list-button'])[2]") public WebElement Pro2;
    //@FindBy(css = "p.content") public WebElement ProAdd2Text;
    @FindBy(linkText = "Compare products list") public WebElement compareListBtn;


    public DesktopsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickPro1()
    {
        Pro1.click();
    }
    public void clickPro2()
    {
        Pro2.click();
    }
    public void clickCompareList()
    {
        compareListBtn.click();
    }

    /*public String getProductText1Add()
    {
        return ProAdd1Text.getText();
    }
    public String getProductText2Add()
    {
        return ProAdd2Text.getText();
    }
     */
}
