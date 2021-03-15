Feature: Hotel Booking In Adactin Application


Scenario Outline: user Login In Login Page

	Given user Launch The Application
	When user Enter The "<Username>" In Username Field
	And user Enter The "<Password>" In Password Field
	Then user Click On The Login Button And it Navigates To The SearchHotelPage
	
	Examples:
	    |Username|Password|
	    |ABC|123798|
	    |mohan2904|emoh2904|
	    |qwer|456798|
	    |red|98776|
	    
	 
Scenario: User Select The Hotel In SearchHotelPage
	
	When user Select The Hotel Location
	And  user Select The Hotel
	And  user Select The Room Type
	And  user Select The No Of Rooms
	And  user Select The Hotel
	And  user Enter The CheckIn Date
	And  user Enter The CheckOut Date
	And  user Select The AdultPerRoom
	And  user Select The ChidrenPerRoom	
	Then user Click On The Search Button And it Navigates To The SelectHotelPage
	
Scenario: User Confirm The Details For Hotel In SelectHotelPage

	When uesr Select The Radio Button To Confirm The Details
	Then user Click The Continue Button	And it Navigates To Book A Hotel
	
Scenario: User Enter The Personel Details And Billing Details

	When user Enter The First_Name	
	And  user Enter The Last_Name
	And  user Enter The Billig_Adress
	And  user Enter The CreditCard Number
	And  user Select The CreditCard Type
	And  user Select The CreditCard Expiry Month 
	And  user Select The CreditCard Expiry Year
	And  user Enter The CVV Number
	Then  user Click The BookNow Button And It Navigates To Booking Confirmation Page
	
Scenario: User Confirm And Click My Itinery Button
	
	Then user Click The My Itinery Button And It Navigates To Booked Itinery Page
	
Scenario: 	user Select Order Id 

	When user Select Order Id By Click Radio Button
	Then  user Click LogOut Button And It Navigates To Click Here To Login Again Page 	 