package Airline_Application.Project_2;

import org.testng.annotations.Test;

public class Tc_6 extends Base_Class {
	@Test
	
	public void search_result_by_selecting_different_classes() throws InterruptedException 
	{
		Tc2_Login_Functionality_With_Valid_Credentials a3=new Tc2_Login_Functionality_With_Valid_Credentials(driver);
		a3.enter_your_mobile_number();
		a3.click_to_continue();
		Tc4_Search_Functionality_For_One_Way_Flight a1=new Tc4_Search_Functionality_For_One_Way_Flight(driver);
		a1.one_way_radio_button();
		a1.write_source_airport();
		a1.write_destination_airport();
		a1.departure_date();
		a1.click_arrow();
		a1.journey_date();
		Tc6_Search_Result_For_Diff_Classes a2=new Tc6_Search_Result_For_Diff_Classes(driver);
		a2.number_of_travellers_and_select_class();
		a2.number_of_adult();
		a2.number_of_children();
		a2.travel_class();
		a2.done_button_click();
		a1.search_button_click();
	}
}
