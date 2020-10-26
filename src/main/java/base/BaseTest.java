package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageObjects.*;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest

{
    public static WebDriver driver;                 // Globaly Defining the variables of driver
    public static HomePage homepage;                   // Globaly Defining the variables of the Pageobjects
    public static LoginPage loginpage;                  // Globaly Defining the variables of the Pageobjects
    public static RegisterPage registerpage;            // Globaly Defining the variables of the Pageobjects
    public static DesktopsPage desktopspage;
    public static CompareProductsPage comparepropage;

    public static final String AUTOMATE_USERNAME = "chetan272";
    public static final String AUTOMATE_ACCESS_KEY = "bh4xFUZKw7vLzrcp1VYx";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @BeforeAll
    public void setUp() throws MalformedURLException
    {
       /* WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        */


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "latest");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.14.0");
        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

        homepage = new HomePage(driver);
        loginpage = new LoginPage(driver);
        registerpage = new RegisterPage(driver);
        desktopspage = new DesktopsPage(driver);
        comparepropage = new CompareProductsPage(driver);

    }

    public String getPageTitle()
    {
       return driver.getTitle();
    }

    public void refresh()
    {
        driver.navigate().refresh();
    }

    @AfterAll
    public void tearDown()
    {
        driver.quit();
    }
}
