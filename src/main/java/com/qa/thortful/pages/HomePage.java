package com.qa.thortful.pages;


import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class HomePage {
	
	private Page page;
	
	//1. String Locators - Object Repo
	
	private String cookieBtn = "//button[@class='ok-button']";
	
	private String birthdayNav = "(//a[text()='Birthday'])[1]";
	private String birthdayForHer = "(//div[text()='For Her '])[1]";
	
	private String anniversaryNav = "(//a[text()='Anniversary'])[1]";
	private String anniversaryForParents = "(//div[text()='For Parents '])[1]";
	
	private String thankYouNav = "(//a[text()='Thank You'])[1]";
	private String thankYouForTeacher = "(//div[text()='For Teacher '])[1]";
	
	private String cardAndGiftNav = "(//a[text()='Card & Gift'])[1]";
	private String cardAndGiftUnder10 = "(//div[text()='Gifts under £10 '])[1]";

	
	// page constructor
	
	public HomePage(Page page) {
		this.page = page;
	}
	
	//3. page actions
	
	public String getHomePageTitle() {
		String title =  page.title();
		System.out.println("page title :" + title);
		return title;
	}
	
	public String getHomePageURL() {
		
		String url =  page.url();
		System.out.println("page url is : " + url);
		
		return url;	
	}
	
    public void clickNavMenu(String menu) {
    	page.click(menu);
	}
    
//    public void clickAllNavMenus() {
//    	this.clickNavMenu(birthdayNav);
//    	this.clickNavMenu(birthdayForHer);
////    	this.clickNavMenu(anniversaryNav);
////    	this.clickNavMenu(anniversaryForParents);
////    	this.clickNavMenu(thankYouNav);
////    	this.clickNavMenu(thankYouForTeacher);
////    	this.clickNavMenu(cardAndGiftNav);
////    	this.clickNavMenu(cardAndGiftUnder10);
//	}
    
    public void hometoBaseket() {
    	page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK")).click();
        page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Sign in")).click();
        page.locator("form[name=\"registerForm\"]").getByText("Log in").click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email")).fill("sarathkumar.jayakumar06@gmail.com");
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email")).press("Tab");
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("London!@#2023");
        page.locator("[data-test-id=\"loginBtn\"]").click();
        page.getByText("SarathKumar").click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Account")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("thortful blue logo")).click();
        page.locator("#desktop").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Birthday")).click();
        page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("RECIPIENT For Him For Her For Dad For Mum For Friend For Brother For Sister For ")).getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("For Her")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Cute Birthday Card - Book Cover - Exhausted Pigeon Stories - The Bloody Marvelous Woman created by Yay Days")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Choose this card")).click();
        page.getByText("Add to basket").click();
        page.getByText("Continue without a gift").click();
    }
    
    
	
    public void acceptCookie() {
    	page.click(cookieBtn);
    }
	
	// Can be removed
	
	// 1. String Locators - OR
//		private String search = "input[name='search']";
//		private String searchIcon = "div#search button";
//		private String searchPageHeader = "div#content h1";
//		private String loginLink = "a:text('Login')"; // By Link Text
//		private String myAccountLink = "a[title='My Account']";
//		
//
//		// 2. page constructor:
//		public HomePage(Page page) {
//			this.page = page;
//		}
//
//		// 3. page actions/methods:
//		public String getHomePageTitle() {
//			String title =  page.title();
//			System.out.println("page title: " + title);
//			return title;
//		}
//
//		public String getHomePageURL() {
//			String url =  page.url();
//			System.out.println("page url : " + url);
//			return url;
//		}
//
//		public String doSearch(String productName) {
//			page.fill(search, productName);
//			page.click(searchIcon);
//			String header =  page.textContent(searchPageHeader);
//			System.out.println("search header: " + header);
//			return header;
//		}
//		
//		public LoginPage navigateToLoginPage() {
//			page.click(myAccountLink);
//			page.click(loginLink);
//			return new LoginPage(page);
//		}
	

}
