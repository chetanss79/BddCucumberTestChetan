Feature: Comparing products from DeskTop section after mouse hoover
  In order to compare products
  As a guest user
  I have to go on home page and MouseHoover on Computers and Click on DeskTops

  Scenario: Verify comparing products through Computers/Desktops section
    Given I navigate to url "https://demo.nopcommerce.com/"
    When I MouseHoover on Computers Tab on the HomePage
    Then I should be able to see and click Desktop link
    Then I should navigate to Desktops Page ExpectedPageTitle "nopCommerce demo store. Desktops"
    When I click on Add to Compare List button of 1st Product which is Build your own Computer
    Then I should be able to see a text saying your product has been added
    When I click on Add to Compare List of 2nd Product which is Digital Storm VANQUISH3 Custom Performance PC
    Then I should be able to see a text saying product has been added
    When I click on Compare products list
    Then I should be navigated to Compare products page ExpectedPageTitle1 "nopCommerce demo store. Compare Products"
    And I should be able to see both the products added to compare product list

