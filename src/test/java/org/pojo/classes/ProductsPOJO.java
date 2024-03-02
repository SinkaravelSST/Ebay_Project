package org.pojo.classes;

import org.base.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPOJO extends BaseClass {
	
	public ProductsPOJO() {

		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//button[@id='gh-shop-a']")
	private WebElement categoryBtn;
	
	@FindBy(xpath="//a[text()='Cell phones & accessories']")
	private WebElement accessories;
	
	@FindBy(xpath="//a[text()='Cell Phones & Smartphones']")
	private WebElement cellAndSmartPhones;
	
	@FindBy(xpath="//h2[text()='All Listings']")
	private WebElement scrollToAllListings;
	
	@FindBy(xpath="//button[text()='All Filters']")
	private WebElement allFilters;
	
	@FindBy(xpath="//span[text()='SIM Card Slot']")
	private WebElement toScroll;
	
	@FindBy(xpath="//div[@role='tab']//child::span[text()='Condition']")
	private WebElement condition;
	
	@FindBy(xpath="//label//child::span[text()='New']")
	private WebElement newInCondition;
	
	@FindBy(xpath="//div[@role='tab']//child::span[text()='Price']")
	private WebElement price;
	
	@FindBy(xpath="(//fieldset//child::input[@type='text'])[1]")
	private WebElement fromPrice;
	
	@FindBy(xpath="(//fieldset//child::input[@type='text'])[2]")
	private WebElement toPrice;
	
	@FindBy(xpath="//span[text()='Item Location']")
	private WebElement itemLocation;
	
	@FindBy(xpath="//input[@aria-label='US Only']")
	private WebElement usLocation;
	
	@FindBy(xpath="//button[@aria-label='Apply']")
	private WebElement applyBtn;
	
	@FindBy(xpath="//h1[@class='b-pageheader']")
	private WebElement verify;

	
	public WebElement getScrollToAllListings() {
		return scrollToAllListings;
	}

	public WebElement getCategoryBtn() {
		return categoryBtn;
	}

	public WebElement getAccessories() {
		return accessories;
	}

	public WebElement getCellAndSmartPhones() {
		return cellAndSmartPhones;
	}

	public WebElement getAllFilters() {
		return allFilters;
	}

	public WebElement getToScroll() {
		return toScroll;
	}

	public WebElement getCondition() {
		return condition;
	}

	public WebElement getNewInCondition() {
		return newInCondition;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getFromPrice() {
		return fromPrice;
	}

	public WebElement getToPrice() {
		return toPrice;
	}

	public WebElement getItemLocation() {
		return itemLocation;
	}

	public WebElement getUsLocation() {
		return usLocation;
	}

	public WebElement getApplyBtn() {
		return applyBtn;
	}

	public WebElement getVerify() {
		return verify;
	}
	
	
	
	

}
