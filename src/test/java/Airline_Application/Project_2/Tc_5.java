package Airline_Application.Project_2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Tc_5 extends Base_Class {
	
	@Test
	
	public void search_flight_round_trip() throws InterruptedException
	{
		Tc2_Login_Functionality_With_Valid_Credentials a3=new Tc2_Login_Functionality_With_Valid_Credentials(driver);
		a3.enter_your_mobile_number();
		a3.click_to_continue();
		Tc5_Search_Functionality_Round_Trip_Flight a1=new Tc5_Search_Functionality_Round_Trip_Flight(driver);
		a1.select_round_trip_radio_button();
		Tc4_Search_Functionality_For_One_Way_Flight a2=new Tc4_Search_Functionality_For_One_Way_Flight(driver);
		a2.write_source_airport();
		a2.write_destination_airport();
		a2.departure_date();
		a2.click_arrow();
		a2.journey_date();
		a1.return_date_select();
		a1.click_arrow();
		a1.journey_date();
		a2.search_button_click();
	}

}
