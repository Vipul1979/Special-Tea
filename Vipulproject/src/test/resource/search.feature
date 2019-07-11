Feature: search
  @smoke
  Scenario: user want to search for product
    Given user is on home page
    When user want to search for product " "
    Then user should see respective products