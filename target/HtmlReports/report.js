$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Products/Products.feature");
formatter.feature({
  "name": "To access the products by search criteria and applying multiple filters",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Access a Product via category after applying multiple filters",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To click category in home page",
  "keyword": "When "
});
formatter.match({
  "location": "UsingFiltersToSearchProduct.to_click_category_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click cell phones and accessories in electronics",
  "keyword": "And "
});
formatter.match({
  "location": "UsingFiltersToSearchProduct.to_click_cell_phones_and_accessories_in_electronics()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click cell phones and smartphones in shop by category",
  "keyword": "And "
});
formatter.match({
  "location": "UsingFiltersToSearchProduct.to_click_cell_phones_and_smartphones_in_shop_by_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click all filters in cell phones and smartphones page",
  "keyword": "And "
});
formatter.match({
  "location": "UsingFiltersToSearchProduct.to_click_all_filters_in_cell_phones_and_smartphones_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To apply condition and Price and Item location filters in the pop-up",
  "keyword": "And "
});
formatter.match({
  "location": "UsingFiltersToSearchProduct.to_apply_condition_and_Price_and_Item_location_filters_in_the_pop_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To verify applied filter product it shown",
  "keyword": "And "
});
formatter.match({
  "location": "UsingFiltersToSearchProduct.to_verify_applied_filter_product_it_shown()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To Access a Product via Search criteria",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To pass any product name to search text box",
  "keyword": "When "
});
formatter.match({
  "location": "SearchProduct.to_pass_any_product_name_to_search_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To change search category to Computers Tablets \u0026 Networking",
  "keyword": "And "
});
formatter.match({
  "location": "SearchProduct.to_change_search_category_to_Computers_Tablets_Networking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click Search",
  "keyword": "And "
});
formatter.match({
  "location": "SearchProduct.to_click_Search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To verify that the first result name matches with the search string",
  "keyword": "And "
});
formatter.match({
  "location": "SearchProduct.to_verify_that_the_first_result_name_matches_with_the_search_string()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});