package Airline_Application.Project_2;

import org.testng.annotations.Test;

public class Tc_13 extends Base_Class {
	
	@Test
	
	public void apply_coupon_code() throws InterruptedException
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
		Tc13_Apply_Coupon_Code_While_Booking_Flight c1=new Tc13_Apply_Coupon_Code_While_Booking_Flight(driver);
		//c1.switchwindow(driver);
		c1.view_all_coupon();
		c1.select_coupon();
		c1.validate_discount();
		
	}

}
