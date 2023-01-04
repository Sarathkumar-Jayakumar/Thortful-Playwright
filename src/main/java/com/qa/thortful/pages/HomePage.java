package com.qa.thortful.pages;


import com.microsoft.playwright.Page;

public class HomePage {
	
	private Page page;
	
//	//1. String Locators - Object Repo
//	
//	private String search = "#header-search";
//	private String searchPageHeader = "//div[contains(@class,'gifting')]/h1";
//	
//	// page constructor
//	
//	public HomePage(Page page) {
//		this.page = page;
//	}
//	
//	//3. page actions
//	
//	public String getHomePageTitle() {
//		String title =  page.title();
//		System.out.println("page title :" + title);
//		return title;
//	}
//	
//	public String getHomePageURL() {
//		
//		String url =  page.url();
//		System.out.println("page url is : " + url);
//		
//		return url;
//		
//	}
//	
//	public void doSearch(String keyword) {
//		
//		page.fill(search, keyword);
////		page.click(search);
////		String header =  page.textContent(searchPageHeader);
////		
////		System.out.println("Search header is : "+ header);
////		
////		return header;
//	}
	
	
	// Can be removed
	
	// 1. String Locators - OR
		private String search = "input[name='search']";
		private String searchIcon = "div#search button";
		private String searchPageHeader = "div#content h1";
		private String loginLink = "a:text('Login')"; // By Link Text
		private String myAccountLink = "a[title='My Account']";
		

		// 2. page constructor:
		public HomePage(Page page) {
			this.page = page;
		}

		// 3. page actions/methods:
		public String getHomePageTitle() {
			String title =  page.title();
			System.out.println("page title: " + title);
			return title;
		}

		public String getHomePageURL() {
			String url =  page.url();
			System.out.println("page url : " + url);
			return url;
		}

		public String doSearch(String productName) {
			page.fill(search, productName);
			page.click(searchIcon);
			String header =  page.textContent(searchPageHeader);
			System.out.println("search header: " + header);
			return header;
		}
		
		public LoginPage navigateToLoginPage() {
			page.click(myAccountLink);
			page.click(loginLink);
			return new LoginPage(page);
		}
	

}
