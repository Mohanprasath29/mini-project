package com.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public static WebDriver driver;
	
	public Book_Hotel(WebDriver driver2) {
		this. driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAdress() {
		return adress;
	}

	public WebElement getCredit_num() {
		return credit_num;
	}

	public WebElement getCredit_type() {
		return credit_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCvv_num() {
		return cvv_num;
	}

	public WebElement getBook_btn() {
		return book_btn;
	}

	@FindBy(xpath="//input[@id='first_name']")
	private WebElement  first_name;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement last_name;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement adress;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement credit_num;
	
	@FindBy (xpath="//select[@id='cc_type']")
	private WebElement credit_type;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement cc_exp_month;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement cc_exp_year;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvv_num;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement book_btn;
	
}
