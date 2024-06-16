Feature: Search Product
  As a User,
  I want to see search product functionality working as expected
  So that I can search anything product what I want

  @Web
  Scenario Outline: Search results product displayed should be relevant to search keyword
    Given User navigate to the online store home page
    When User search for keyword "<Keyword Search>" in search box and click button search
    Then User can see product on the result page is contains "<Keyword Search>"

    Examples:
      | Keyword Search |
      | Jacket         |
      | Pant           |
      | Short          |

  @Web @Regression @C1234
  Scenario: Search results displayed product not available when not relevant search keyword
    Given User navigate to the online store home page
    When User search for keyword "Shopee" in search box and click button search
    Then User can see info message "Your search returned no results."