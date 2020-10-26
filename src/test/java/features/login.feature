Feature: Login to NopCommerce Application
  In order to login
  As a valid user
  I have to provide valid user name and password

  Scenario: Verify login with valid credentials
    Given I navigate to url "https://demo.nopcommerce.com/"
    When I click on login link from Navbar
    Then I should be able too navigate to login page
    When I enter email'chetans@gmail.com'
    And I enter password 'chetans'
    And I click on Login Button
    Then I should be successfully Logged In