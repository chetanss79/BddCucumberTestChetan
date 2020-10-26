import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.CompareProductsPage;

import java.net.MalformedURLException;

public class StepDefinition extends BaseTest {
    String expectedHomePageTitle = "nopCommerce demo store";

    @Given("I navigate to url {string}")
    public void i_navigate_to_url(String url) throws MalformedURLException {
        setUp();
        homepage.navigateToUrl(url);

        Assertions.assertEquals(expectedHomePageTitle, homepage.getPageTitle());
        System.out.println("Actual Home Page Title is: " + homepage.getPageTitle());
    }

    @When("I click on Register link")
    public void i_click_on_register_link() {
        homepage.clickRegisterLink();
        refresh();
    }

    @Then("I should be navigated to Register Page")
    public void i_should_be_navigated_to_register_page() {
        String RegisterPageTitle = getPageTitle();
        System.out.println("The Register Page title is: " + getPageTitle());

    }

    @When("I select gender")
    public void i_select_gender() {
        registerpage.clickMaleRdioBtn();
    }

    @When("I enter firstName lastName email password confirmPassword")
    public void i_enter_first_name_last_name_email_password_confirm_password(io.cucumber.datatable.DataTable dataTable) {
        registerpage.enterFirstName(dataTable.cell(1, 0));
        registerpage.enterLastName(dataTable.cell(1, 1));
        registerpage.enterEmailText(dataTable.cell(1, 2));
        registerpage.enterPassword(dataTable.cell(1, 3));
        registerpage.enterConfirmPassword(dataTable.cell(1, 4));
    }

    @When("I click on register button")
    public void i_click_on_register_button() {
        registerpage.clickRegisterBtn();
    }

    @Then("registration should be successful")
    public void registration_should_be_successful() {
        String RegConfText = registerpage.getActRegConf();
        System.out.println("Succesfull Registration Confirmation Text: " + RegConfText);
        tearDown();
    }

    //----------------------------------------------------------------------------------------------
    @When("I MouseHoover on Computers Tab on the HomePage")
    public void i_mouse_hoover_on_computers_tab_on_the_home_page() {
        homepage.hooverOnComp();
    }

    @Then("I should be able to see and click Desktop link")
    public void i_should_be_able_to_see_and_click_desktop_link() {
        homepage.clickDesktopBtn();
    }

    @Then("I should navigate to Desktops Page ExpectedPageTitle {string}")
    public void i_should_navigate_to_desktops_page_expected_page_title(String ExpectedPageTitle)
    {
        String actualPageTitle = desktopspage.getPageTitle();
        //Assertions.assertEquals(ExpectedPageTitle, actualPageTitle);
        System.out.println("Acutal Desktop page Title is: " + actualPageTitle);
        refresh();
        //WebDriverWait w = new WebDriverWait(driver, 1000);
        //w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Desktops']")));

    }

    @When("I click on Add to Compare List button of 1st Product which is Build your own Computer")
    public void i_click_on_add_to_compare_list_button_of_1st_product_which_is_build_your_own_computer()
    {
        desktopspage.clickPro1();

    }

    @Then("I should be able to see a text saying your product has been added")
    public void i_should_be_able_to_see_a_text_saying_expected_text()
    {
        WebDriverWait wait = new WebDriverWait(driver, 5000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p.content")));
        refresh();
    }
    @When("I click on Add to Compare List of 2nd Product which is Digital Storm VANQUISH3 Custom Performance PC")
    public void i_click_on_add_to_compare_list_of_2nd_product_which_is_digital_storm_vanquish_custom_performance_pc()
    {
        //WebDriverWait wait1 = new WebDriverWait(driver,3000);
        //wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@class='button-2 add-to-compare-list-button'])[2]")));

        desktopspage.clickPro2();

    }
    @Then("I should be able to see a text saying product has been added")
    public void i_should_be_able_to_see_a_text_saying_expected_text1_product_has_been_added()
    {
        WebDriverWait wait = new WebDriverWait(driver, 5000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p.content")));
        refresh();
    }
    @When("I click on Compare products list")
    public void i_click_on_compare_products_list()
    {
        desktopspage.clickCompareList();
    }
    @Then("I should be navigated to Compare products page ExpectedPageTitle1 {string}")
    public void i_should_be_navigated_to_compare_products_page_expected_page_title1(String ExpectedPageTitle1)
    {
        String actualCPTitle = comparepropage.getPageTitle();
        Assertions.assertEquals(ExpectedPageTitle1,actualCPTitle);
        System.out.println("Actual Compare Products Page Title is: " + actualCPTitle);

    }
    @Then("I should be able to see both the products added to compare product list")
    public void i_should_be_able_to_see_both_the_products_added_to_compare_product_list()
    {
        System.out.println("Product 1 Added is: " + comparepropage.getProduct1() + "Price: " + comparepropage.getPrice1());
        System.out.println("Product 2 Added is: " + comparepropage.getProduct2() + "Price: " + comparepropage.getPrice2());

        WebDriverWait wait = new WebDriverWait(driver, 5000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Build your own computer']")));

        tearDown();
    }
}