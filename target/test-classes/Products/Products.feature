Feature: To access the products by search criteria and applying multiple filters

  Scenario: To Access a Product via category after applying multiple filters
    When To click category in home page
    And To click cell phones and accessories in electronics
    And To click cell phones and smartphones in shop by category
    And To click all filters in cell phones and smartphones page
    And To apply condition and Price and Item location filters in the pop-up
    And To verify applied filter product it shown

  Scenario: To Access a Product via Search criteria
    When To pass any product name to search text box
    And To change search category to Computers Tablets & Networking
    And To click Search
    And To verify that the first result name matches with the search string
