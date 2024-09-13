package Airline_Application.Project_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Tc3_Login_With_Invalid_Credentials {
	WebDriver driver;
	
	@FindBy(xpath="//input[@class='loginCont__input']")
	WebElement enter_mobile_no;
	
	@FindBy(xpath="//button[@class='sc-dhKdcB cYwnDu  ']")
	WebElement click_continue;
	
	@FindBy(xpath="//p[@class='sc-jlZhew dSoaQL']")
	WebElement validation_msg;
	
	public void enter_your_mobile_number()
	{
		enter_mobile_no.clear();
		enter_mobile_no.sendKeys("1234567890");
	}
	
	public void click_to_continue()
	{
		click_continue.click();
	}
	
	public void validation_method()
	{
		String actual_error_text= validation_msg.getText();
		System.out.println(actual_error_text);
		String expected_error_text="Please enter a valid mobile number";
		Assert.assertEquals(actual_error_text, expected_error_text);
	}
	public Tc3_Login_With_Invalid_Credentials(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
