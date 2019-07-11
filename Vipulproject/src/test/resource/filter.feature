Feature: filter products
  @regression
  Scenario: search for price range products from filter
    Given user is on home page
    When user want to search for product " "
    Then user should see respective products
    And user want to search products for pricerange filter
    When user select one of the pricerange filter
    Then user should see respected pricerange products
