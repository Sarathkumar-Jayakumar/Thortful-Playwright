package com.qa.thortful.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	
	private Page page;
	
	private String emailId = "//input[@id='input-email']";
	private String passwordField = "//input[@id='input-password']";
	private String loginBtn = "//input[@value='Login']";
	private String forgotPwdLink = "//div[@class='form-group']//a[normalize-space()='Forgotten Password']";
	private String logoutLink = "//a[@class='list-group-item'][normalize-space()='Logout']";
	
	
	public LoginPage(Page page) {
		this.page = page;
	}
	
	// Actions
	
	public String getLoginPageTitle() {
		String title = page.title();
		return title;
	}
	
	public boolean isForgotPwdLinkExist() {
		return page.isVisible(forgotPwdLink);
	}
	
	public boolean doLogin(String userName, String password) {
		page.fill(emailId, userName);
		page.fill(passwordField, password);
		page.click(loginBtn);
		
		if(page.isVisible(logoutLink)) {
			System.out.println("User logged in successfully");
			return true;
		}
		
		return false;

	}
	
	

}
