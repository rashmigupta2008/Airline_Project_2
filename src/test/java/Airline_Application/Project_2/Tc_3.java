package Airline_Application.Project_2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Tc_3 extends Base_Class {
	
	@Test
	
	public void login_with_invalid_credentials()
	{
		Tc3_Login_With_Invalid_Credentials a1=new Tc3_Login_With_Invalid_Credentials(driver);
		a1.enter_your_mobile_number();
		a1.click_to_continue();
		a1.validation_method();
	}
}
