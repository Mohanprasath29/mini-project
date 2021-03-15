package com.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	public static WebDriver driver;
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radio_btn;
	
	@FindBy(xpath="//input [@id='continue']")
	private WebElement cont_btn;
	public WebElement getCont_btn() {
		return cont_btn;
	}
	public Select_hotel(WebDriver driver2) {
		this. driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getRadio_btn() {
		return radio_btn;
	}
}
