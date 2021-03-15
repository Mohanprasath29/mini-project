package com.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Search {
	public WebDriver driver;
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	public Hotel_Search(WebDriver driver2) {
		this. driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public void setAdult_room(WebElement adult_room) {
		this.adult_room = adult_room;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_num() {
		return room_num;
	}

	public WebElement getCheck_in() {
		return check_in;
	}

	public WebElement getCheck_out() {
		return check_out;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}

	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement room_type;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement room_num;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement check_in;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement check_out;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adult_room;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement child_room;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement search_btn;
	
	
	
	
	
	
}
