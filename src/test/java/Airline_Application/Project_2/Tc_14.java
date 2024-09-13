package Airline_Application.Project_2;

public class Tc_14 extends Base_Class{
	
	public void search_domestic_roundtrip_flight() throws InterruptedException
	{
		Tc2_Login_Functionality_With_Valid_Credentials a3=new Tc2_Login_Functionality_With_Valid_Credentials(driver);
		a3.enter_your_mobile_number();
		a3.click_to_continue();
		Tc5_Search_Functionality_Round_Trip_Flight a1=new Tc5_Search_Functionality_Round_Trip_Flight(driver);
		a1.select_round_trip_radio_button();
		Tc14_Search_For_Domestic_Roundtrip_Flight a2=new Tc14_Search_For_Domestic_Roundtrip_Flight(driver);
		a2.source_airport1();
		a2.destination_airport1();
		Tc4_Search_Functionality_For_One_Way_Flight a4= new Tc4_Search_Functionality_For_One_Way_Flight(driver);
		a4.departure_date();
		a4.click_arrow();
		a1.return_date_select();
		a1.click_arrow();
		a1.journey_date();
		a4.search_button_click();
	}

}
