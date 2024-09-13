package Airline_Application.Project_2;

import org.testng.annotations.Test;

public class Tc_7 extends Base_Class {
	@Test
	
	public void search_flight_for_multicity() throws InterruptedException
	{
		Tc2_Login_Functionality_With_Valid_Credentials a3=new Tc2_Login_Functionality_With_Valid_Credentials(driver);
		a3.enter_your_mobile_number();
		a3.click_to_continue();
		Tc4_Search_Functionality_For_One_Way_Flight a2=new Tc4_Search_Functionality_For_One_Way_Flight(driver);
		a2.write_source_airport();
		a2.write_destination_airport();
		a2.departure_date();
		a2.click_arrow();
		a2.journey_date();
		Tc7_Search_For_Multicity_Flight a1=new Tc7_Search_For_Multicity_Flight(driver);
		a1.select_multicity_option();
		a1.enter_the_source_city();
		a1.enter_the_destination_city();
		a1.select_date();
		a1.select_forward_arrow();
		a1.date_31();
		a2.search_button_click();
	}
}
