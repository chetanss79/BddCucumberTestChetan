Feature: Regiser new user

  Scenario: Register new user by providing data in all mandatory fields

    Given I navigate to url "https://demo.nopcommerce.com/"
    When I click on Register link
    Then I should be navigated to Register Page
    When I select gender
    And I enter firstName lastName email password confirmPassword

    |firstName|lastName|email                   |password       |confirmPassword       |
    | chetan  | Shama  |chetans79@gmail.com     | chetans       |  chetans             |

    And I click on register button
    Then registration should be successful