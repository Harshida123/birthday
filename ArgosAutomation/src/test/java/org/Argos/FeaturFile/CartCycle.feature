Feature: full cart life cycle
  as a user I would open argos website
  and search product on home page
  once find  search item want to select price range.
  once item displayed within range select item and add to trolley
  and then goto trolley and once complete the cycle remove item from basket page.
  Scenario: Search nike product on argos website
    Given Open argos website
    And search "Nike" products
    When When product display select price range
    And add selected item in trolley
    When and click goto trolly
    And go to basket page
    Then remove item
