package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",
                 glue="org.stepdefinition",
                 monochrome=true,
                 dryRun=false,
                 plugin= {"pretty", "html:target\\HtmlReports"})
public class TestRunnerClass {
	
	@AfterClass
	public static void Report() {

		System.out.println("HTML report generated in target folder");
	}
	
	
}
