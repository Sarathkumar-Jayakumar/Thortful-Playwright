package com.qa.thortful.base;

import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.microsoft.playwright.Page;
import com.qa.thortful.factory.PlaywrightFactory;
import com.qa.thortful.pages.HomePage;
import com.qa.thortful.pages.LoginPage;

public class BaseTest {
	

	PlaywrightFactory pf;
	Page page;
	protected Properties prop;
	protected HomePage homePage;
	protected LoginPage loginPage;
	
	@Parameters({ "browser" })
	@BeforeTest
	public void setup(String browserName) {
		pf = new PlaywrightFactory();
		prop = pf.initProp();
		//page = pf.initBrowser("chromium");
		
		
		if(browserName!=null) {
			prop.setProperty("browser", browserName);
		}
		
		page = pf.initBrowser(prop);
		
		homePage = new HomePage(page);
	}
	
	@AfterTest
	public void tearDown() {
		page.context().browser().close();
	}
	

}
