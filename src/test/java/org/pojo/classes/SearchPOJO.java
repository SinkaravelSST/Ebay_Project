package org.pojo.classes;

import org.base.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPOJO extends BaseClass {
	
	public SearchPOJO() {

		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	private WebElement searchBox;
	
	@FindBy(tagName="select")
	private WebElement categoryDropDown;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchBtn;
	
	@FindBy(xpath="(//div[@class='s-item__title']//child::span)[2]")
	private WebElement firstProduct;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getCategoryDropDown() {
		return categoryDropDown;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getFirstProduct() {
		return firstProduct;
	}
	
	

}
