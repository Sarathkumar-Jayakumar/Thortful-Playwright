package com.qa.thortful.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.qa.thortful.base.BaseTest;
import com.qa.thortful.constants.AppConstants;


public class HomePageTest extends BaseTest {

//	@Test
//	public void homePageTitleTest() {
//		String actualTitle = homepage.getHomePageTitle();
//		
//		Assert.assertEquals(actualTitle, "thortful | Send Greeting Cards | Order Online & It’s Sent Today");
//	}
//	
//	@Test
//	public void homePageUrlTest() {
//		String actualUrl = homepage.getHomePageURL();
//		
//		Assert.assertEquals(actualUrl, "https://www.thortful.com/");
//	}
//	
//	@DataProvider
//	public Object[][] getProductData() {
//		return new Object[][] {
//			{"Birthday"},
//			{"Anniversary"},
//			{"Thank You"}
//		};
//	}
//	
//	@Test (dataProvider = "getProductData")
//	public void searchTest(String cardCategory) {
//	 homepage.doSearch(cardCategory);
//		
//		//String actualSearchHeader = homepage.doSearch("birthday");
//		//Assert.assertEquals(actualSearchHeader, "Birthday Cards ");
//	}
	
	// Practice:
	
	@Test
	public void verifyHomePageTitleTest() {
		String actualTitle = homePage.getHomePageTitle();
		Assert.assertEquals(actualTitle, AppConstants.HOME_PAGE_TITLE);
	}

	@Test
	public void verifyHomePageURLTest() {
		String actualURL = homePage.getHomePageURL();
		Assert.assertEquals(actualURL, prop.getProperty("url"));
	}
	
	@Test
	public void verifyHometoBaseketE2ETest() {
		homePage.hometoBaseket();
	}
	
//	@Test
//	public void navigationTest() {
//		homePage.clickAllNavMenus();
//	}

	
	
//	@DataProvider
//	public Object[][] getProductData() {
//		return new Object[][] {
//				{ "Macbook" }, 
//				{ "iMac" }, 
//				{ "Samsung" }
//		};
//	}
//
//	@Test(dataProvider = "getProductData")
//	public void searchTest(String productName) throws InterruptedException {
//		Thread.sleep(5000);
//		String actualSearchHeader = homePage.doSearch(productName);
//		Assert.assertEquals(actualSearchHeader, "Search - " + productName);
//	}

	
	
	
}
