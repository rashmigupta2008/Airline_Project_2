package Airline_Application.Project_2;

import org.testng.annotations.Test;

public class Tc_12 extends Base_Class {
	
	@Test
	
	public void login_search_flight_logout_profile() throws InterruptedException
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
			
		Tc12_Login_Page_Search_Flight_Logout a3=new Tc12_Login_Page_Search_Flight_Logout(driver);
			a3.hover_profile_name();
			a3.view_your_profile();
			a3.logout();
			a3.confirm_logout();

	}

}
