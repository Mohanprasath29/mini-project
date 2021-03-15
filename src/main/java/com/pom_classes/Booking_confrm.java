package com.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_confrm {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='my_itinerary']")
	private WebElement itinery_btn;

	public Booking_confrm(WebDriver driver2) {
		this. driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getItinery_btn() {
		return itinery_btn;
	}
	
	
}
