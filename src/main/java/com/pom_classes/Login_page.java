package com.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public static WebDriver driver;
	
	public Login_page(WebDriver driver2) {
		this. driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsr_name() {
		return usr_name;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

	@FindBy(xpath="//input[@id='username']")
	private WebElement usr_name;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement login_btn;

}
