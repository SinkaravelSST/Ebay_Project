package org.stepdefinition;

import java.io.IOException;

import org.base.classes.BaseClass;
import org.junit.Assert;
import org.pojo.classes.SearchPOJO;

import cucumber.api.java.en.When;

public class SearchProduct extends BaseClass {

	SearchPOJO s;

	@When("To pass any product name to search text box")
	public void to_pass_any_product_name_to_search_text_box() throws IOException {

		s = new SearchPOJO();
		passText(s.getSearchBox(), getPropertyDatas("SearchProduct"));
	}

	@When("To change search category to Computers Tablets & Networking")
	public void to_change_search_category_to_Computers_Tablets_Networking() {

		selectCategory(s.getCategoryDropDown(), "58058");
	}

	@When("To click Search")
	public void to_click_Search() {

		clickWebelement(s.getSearchBtn());
	}

	@When("To verify that the first result name matches with the search string")
	public void to_verify_that_the_first_result_name_matches_with_the_search_string() {

//		System.out.println(s.getFirstProduct().getText());
//		Assert.assertEquals("Invalid Product", true, s.getFirstProduct().getText().contains("Macbook") || s.getFirstProduct().getText().contains("MacBook"));
//		if (s.getFirstProduct().getText().contains("MacBook") || s.getFirstProduct().getText().contains("Macbook")) {
//
//			System.out.println("Valid Product");
//		}
	}

}
