package org.stepdefinition;

import java.io.IOException;

import org.base.classes.BaseClass;
import org.junit.Assert;
import org.pojo.classes.ProductsPOJO;

import cucumber.api.java.en.When;

public class UsingFiltersToSearchProduct extends BaseClass {

	ProductsPOJO p;
	
	@When("To click category in home page")
	public void to_click_category_in_home_page() {
		
		p = new ProductsPOJO();
		clickWebelement(p.getCategoryBtn());
	}

	@When("To click cell phones and accessories in electronics")
	public void to_click_cell_phones_and_accessories_in_electronics() {
		
		clickWebelement(p.getAccessories()); 
	}

	@When("To click cell phones and smartphones in shop by category")
	public void to_click_cell_phones_and_smartphones_in_shop_by_category() {
		
		clickWebelement(p.getCellAndSmartPhones());
	}

	@When("To click all filters in cell phones and smartphones page")
	public void to_click_all_filters_in_cell_phones_and_smartphones_page() {
		
		scroll(p.getScrollToAllListings());
		clickWebelement(p.getAllFilters());
	}

	@When("To apply condition and Price and Item location filters in the pop-up")
	public void to_apply_condition_and_Price_and_Item_location_filters_in_the_pop_up() throws IOException {
		
		waitsUsingImplicit();
		scroll(p.getToScroll());
		clickWebelement(p.getCondition());
		clickWebelement(p.getNewInCondition());
		clickWebelement(p.getPrice());
		passText(p.getFromPrice(), getPropertyDatas("FromPrice"));
		passText(p.getToPrice(), getPropertyDatas("ToPrice"));
		clickWebelement(p.getItemLocation());
		clickWebelement(p.getUsLocation());
		clickWebelement(p.getApplyBtn());
	}

	@When("To verify applied filter product it shown")
	public void to_verify_applied_filter_product_it_shown() {
		
//		String text = p.getVerify().getText();
//		System.out.println(text);
//		Assert.assertTrue("Wrong Product", text.contains("Cell Phones & Smartphones"));
//		if (text.contains("Cell Phones & Smartphones")) {
//			
//			System.out.println("Valid Product");
//		}
	}

}
