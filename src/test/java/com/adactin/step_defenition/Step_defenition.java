package com.adactin.step_defenition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;

import base_class.Base_Class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_defenition extends Base_Class {

	public static WebDriver driver = Runner.driver;

	PageObjectManager pom = new PageObjectManager(driver);
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = FileReaderManager.getInstance().getInstanceCR().getUrl();
		getUrl(url);
		System.out.println("loaded");

	}
	
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String arg1) throws Throwable {
		String username = FileReaderManager.getInstance().getInstanceCR().getUsername();
		inputValueElement(pom.get_login().getUsr_name(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String arg1) throws Throwable {
		String password = FileReaderManager.getInstance().getInstanceCR().getPassword();
		inputValueElement(pom.get_login().getPass(), password);

	}

	@Then("^user Click On The Login Button And it Navigates To The SearchHotelPage$")
	public void user_Click_On_The_Login_Button_And_it_Navigates_To_The_SearchHotelPage() throws Throwable {
		clickOnElement(pom.get_login().getLogin_btn());
	}

	@When("^user Select The Hotel Location$")
	public void user_Select_The_Hotel_Location() throws Throwable {

		drop_Down(pom.get_search().getLocation(), "value", "Los Angeles", null);
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		drop_Down(pom.get_search().getHotels(), "value", "Hotel Sunshine", null);

	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		drop_Down(pom.get_search().getRoom_type(), "value", "Double", null);
	}

	@When("^user Select The No Of Rooms$")
	public void user_Select_The_No_Of_Rooms() throws Throwable {

		drop_Down(pom.get_search().getRoom_num(), "value", "2", null);
	}

	@When("^user Enter The CheckIn Date$")
	public void user_Enter_The_CheckIn_Date() throws Throwable {

		inputValueElement(pom.get_search().getCheck_in(), "22/02/2021");
	}

	@When("^user Enter The CheckOut Date$")
	public void user_Enter_The_CheckOut_Date() throws Throwable {
		inputValueElement(pom.get_search().getCheck_out(), "24/02/2021");
	}

	@When("^user Select The AdultPerRoom$")
	public void user_Select_The_AdultPerRoom() throws Throwable {

		drop_Down(pom.get_search().getAdult_room(), "value", "2", null);
	}

	@When("^user Select The ChidrenPerRoom$")
	public void user_Select_The_ChidrenPerRoom() throws Throwable {
		drop_Down(pom.get_search().getChild_room(), "value", "0", null);
	}

	@Then("^user Click On The Search Button And it Navigates To The SelectHotelPage$")
	public void user_Click_On_The_Search_Button_And_it_Navigates_To_The_SelectHotelPage() throws Throwable {
		clickOnElement(pom.get_search().getSearch_btn());
	}

	@When("^uesr Select The Radio Button To Confirm The Details$")
	public void uesr_Select_The_Radio_Button_To_Confirm_The_Details() throws Throwable {

		clickOnElement(pom.get_selection().getRadio_btn());
	}

	@Then("^user Click The Continue Button	And it Navigates To Book A Hotel$")
	public void user_Click_The_Continue_Button_And_it_Navigates_To_Book_A_Hotel() throws Throwable {
		clickOnElement(pom.get_selection().getCont_btn());
	}

	@When("^user Enter The First_Name$")
	public void user_Enter_The_First_Name() throws Throwable {
		inputValueElement(pom.get_booking().getFirst_name(), "alpha");
	}

	@When("^user Enter The Last_Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
		inputValueElement(pom.get_booking().getLast_name(), "beta");
	}

	@When("^user Enter The Billig_Adress$")
	public void user_Enter_The_Billig_Adress() throws Throwable {
		inputValueElement(pom.get_booking().getAdress(), "pluto");
	}

	@When("^user Enter The CreditCard Number$")
	public void user_Enter_The_CreditCard_Number() throws Throwable {
		inputValueElement(pom.get_booking().getCredit_num(), "2555355286538759");

	}

	@When("^user Select The CreditCard Type$")
	public void user_Select_The_CreditCard_Type() throws Throwable {
		drop_Down(pom.get_booking().getCredit_type(), "value", "VISA", null);
	}

	@When("^user Select The CreditCard Expiry Month$")
	public void user_Select_The_CreditCard_Expiry_Month() throws Throwable {
		drop_Down(pom.get_booking().getCc_exp_month(), "value", "3", null);
	}

	@When("^user Select The CreditCard Expiry Year$")
	public void user_Select_The_CreditCard_Expiry_Year() throws Throwable {
		drop_Down(pom.get_booking().getCc_exp_year(), "value", "2022", null);
	}

	@When("^user Enter The CVV Number$")
	public void user_Enter_The_CVV_Number() throws Throwable {
		inputValueElement(pom.get_booking().getCvv_num(), "555");
	}

	@Then("^user Click The BookNow Button And It Navigates To Booking Confirmation Page$")
	public void user_Click_The_BookNow_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
		clickOnElement(pom.get_booking().getBook_btn());
	}

	@Then("^user Click The My Itinery Button And It Navigates To Booked Itinery Page$")
	public void user_Click_The_My_Itinery_Button_And_It_Navigates_To_Booked_Itinery_Page() throws Throwable {
		Thread.sleep(5000);
		clickOnElement(pom.get_Confirmation().getItinery_btn());
	}

	@When("^user Select Order Id By Click Radio Button$")
	public void user_Select_Order_Id_By_Click_Radio_Button() throws Throwable {
		clickOnElement(pom.get_itenery().getCheck_all());
	}

	@Then("^user Click LogOut Button And It Navigates To Click Here To Login Again Page$")
	public void user_Click_LogOut_Button_And_It_Navigates_To_Click_Here_To_Login_Again_Page() throws Throwable {
		clickOnElement(pom.get_itenery().getLogOutBtn());
	}

}
