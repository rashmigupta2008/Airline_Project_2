package Airline_Application.Project_2;

import org.testng.annotations.Test;

public class Tc_8 extends Base_Class {
	
	@Test
	
	public void check_seat_availability() throws InterruptedException
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
		
		Tc15_Reach_Payment_Page_Make_Payment a3=new Tc15_Reach_Payment_Page_Make_Payment(driver);
		//	a3.one_stop();
			a3.view_fares();
			
		//	e1.paid_seat();
			a3.chargable_meal();
			a3.check_in_baggage();
			a3.validate_chargable_meal();
			a3.validate_check_in_baggage();
			a3.book_ticket(driver);
			
			Tc11_Validate_User_Can_Enter_Personal_Details a4=new Tc11_Validate_User_Can_Enter_Personal_Details(driver);
			a4.billing_address();
			a4.pincode();
			a4.state();
			a4.billing_info_save();
			a4.gender();
			a4.first_name();
			a4.last_name();
			a4.email_id();
			a4.mobile_number();
			a3.travel_unsecured();
			a3.proceed(driver);
			a3.thats_correct();
			a3.extra_legroom_charge();
			a3.validate_extra_legroom_charge();
			
//			Tc12_Login_Page_Search_Flight_Logout a5=new Tc12_Login_Page_Search_Flight_Logout(driver);
//			a5.hover_profile_name();
//			a5.view_your_profile();
//			a5.logout();
//			a5.confirm_logout();
	}
}
