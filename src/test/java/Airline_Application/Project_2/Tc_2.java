package Airline_Application.Project_2;

//verify that users can successfully register for a new account

import org.testng.annotations.Test;

public class Tc_2 extends Base_Class {
	
	@Test
	
	public void login_with_valid_credentials()
	{
		Tc2_Login_Functionality_With_Valid_Credentials a1=new Tc2_Login_Functionality_With_Valid_Credentials(driver);
		a1.enter_your_mobile_number();
		a1.click_to_continue();
	}
}
