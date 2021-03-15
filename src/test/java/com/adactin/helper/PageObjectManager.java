package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.pom_classes.Book_Hotel;
import com.pom_classes.Booked_itenery;
import com.pom_classes.Booking_confrm;
import com.pom_classes.Hotel_Search;
import com.pom_classes.Login_page;
import com.pom_classes.Select_hotel;

public class PageObjectManager {
	public static WebDriver driver;
	
	private  Login_page login;
	private Hotel_Search hotel_Search;
	private Select_hotel select_hotel;
	private Book_Hotel book_Hotel;
	private Booked_itenery book_itinery;
	private Booking_confrm booking_Confrm;
	
	
	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public  Login_page get_login() {
		login= new Login_page(driver);
		return login;

	}
	
	public Hotel_Search get_search() {
		hotel_Search = new Hotel_Search(driver);
		return hotel_Search;
		
	}
	
	public Select_hotel get_selection() {
		select_hotel = new Select_hotel(driver);
		return select_hotel;
		
	}
	
	public Book_Hotel get_booking() {
		book_Hotel =new Book_Hotel(driver);
		return book_Hotel;
	}
	
	public Booked_itenery get_itenery() {

		book_itinery = new Booked_itenery(driver);
		return book_itinery;
		
	}
	public Booking_confrm get_Confirmation() {
		booking_Confrm = new Booking_confrm(driver);
		return booking_Confrm;
	}
	
	
	
	
	/*Login_page login = new Login_page(driver);
	Hotel_Search hotel_Search = new Hotel_Search(driver);
	Select_hotel select_hotel = new Select_hotel(driver);
	Book_Hotel book_Hotel =new Book_Hotel(driver);
	Booked_itenery book_itinery = new Booked_itenery(driver);
	Booking_confrm booking_Confrm = new Booking_confrm(driver);*/

}
