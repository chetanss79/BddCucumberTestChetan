Feature: Login to NopCommerce Application
  In order to login
  As a valid user
  I have to provide valid user name and password

  Scenario Outline: Verify login with valid credentials
    Given I navigate to url "https://demo.nopcommerce.com/"
    When I click on login link from Navbar
    Then I should be able too navigate to login page
    When I enter email"<email>"
    And I enter password "<password>"
    And I click on Login Button
    Then I should be successfully Logged In

    Examples:
    |      email              |     password        |
    |chetans79@gmail.com      | chetans             |
    |    chetans7@gmail.com   | chetans             |