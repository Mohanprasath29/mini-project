package com.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_itenery {
public static WebDriver driver;

public Booked_itenery(WebDriver driver2) {
	
	this. driver = driver2;
	PageFactory.initElements(driver, this);
	
	
}



public WebElement getCheck_all() {
	return check_all;
}

public WebElement getLogOutBtn() {
	return logOutBtn;
}

@FindBy(xpath="//input[@id='check_all']")
private WebElement check_all;

@FindBy(xpath="//input[@id='logout']")
private WebElement logOutBtn;


}
