package org.base.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver d;
	public static Select s;

	public static void browserLaunch(String browserName) {

		if (browserName.equals("Chrome")) {

			d = new ChromeDriver();
		}
		else if (browserName.equals("Firefox")) {

			d = new FirefoxDriver();
		}
		else if (browserName.equals("Edge")) {

			d = new EdgeDriver();
		}
		d.manage().window().maximize();
	}
	
	public static void waitsUsingImplicit() {

		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	public static String getPropertyDatas(String propertyKey) throws IOException {

		File f = new File("C:\\Users\\VISHAL\\eclipse-workspace\\Ebay\\SampleDatas.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(propertyKey); 
	}  	

	public static void launchUrl(String url) {

		d.get(url);
	}
	
	public static void scroll(WebElement targetWebelement) {

		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView(true)", targetWebelement);
	}
	
	public static String getUrl() { 

		String url = d.getCurrentUrl();
		return url; 
	}
	
	public static String getTheTitle() {

		String title = d.getTitle();
		return title;
	}

	public static void passText(WebElement element, String txt) {

		element.sendKeys(txt);
	}

	public static void clickWebelement(WebElement element) {

		element.click();
	}	
	
	public static void closeBrowser() {

		d.quit();
	}
	
	public static void selectCategory(WebElement targetDropDown, String val) {

		s = new Select(targetDropDown);
		s.selectByValue(val);
	}
	
	
}
