package Airline_Application.Project_2;

import org.testng.annotations.Test;

public class Tc_10 extends Base_Class {
	
	@Test
	
	public void flight_information_in_search_result_page() throws InterruptedException
	{
		Tc2_Login_Functionality_With_Valid_Credentials a2=new Tc2_Login_Functionality_With_Valid_Credentials(driver);
		a2.enter_your_mobile_number();
		a2.click_to_continue();
		Tc4_Search_Functionality_For_One_Way_Flight a1=new Tc4_Search_Functionality_For_One_Way_Flight(driver);
		a1.one_way_radio_button();
		a1.write_source_airport();
		a1.write_destination_airport();
		a1.departure_date();
		a1.click_arrow();
		a1.journey_date();
		a1.search_button_click();
		
		Tc10_Flight_Information_Details a3=new Tc10_Flight_Information_Details(driver);
		a3.flight_detail();
		a3.flight_info();
		a3.validate_flight_info_link();
		a3.validate_fare_details();
		a3.baggage_details();
		a3.validate_baggage_details();
		a3.cancel_details();
		a3.validate_cancel_details();
	}

}
