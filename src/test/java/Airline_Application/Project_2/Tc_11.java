package Airline_Application.Project_2;

import org.testng.annotations.Test;

public class Tc_11 extends Base_Class {
	
	@Test
	
	public void verify_user_details() throws InterruptedException
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
		
		Tc11_Validate_User_Can_Enter_Personal_Details a3=new Tc11_Validate_User_Can_Enter_Personal_Details(driver);
		a3.email_id();
		a3.mobile_number();
		a3.first_name();
		a3.last_name();
		a3.gender();
		a3.personal_info_save();
		a3.billing_address();
		a3.pincode();
		a3.state_arrowdown();
		a3.state();
		a3.billing_info_save();
		a3.offers_available();
		a3.proceed_with_booking();
		
	}

}
