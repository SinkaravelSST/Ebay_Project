package org.stepdefinition;

import java.io.IOException;

import org.base.classes.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	
	@Before
	public void preCondition() throws IOException {

		browserLaunch("Chrome");
		launchUrl(getPropertyDatas("url"));
	} 
	
	@After
	public void postCondition() {

		closeBrowser();
	}
	
}
