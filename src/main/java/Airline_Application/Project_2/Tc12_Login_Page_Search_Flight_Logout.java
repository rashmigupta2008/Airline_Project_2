package Airline_Application.Project_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc12_Login_Page_Search_Flight_Logout {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='sc-fifgRP iKzBkA']")
	WebElement hover_profile_name_1;
	
	@FindBy(xpath="//div[@class='sc-ehixzo cETxmN']")
	WebElement view_your_profile_1;
	
	@FindBy(xpath="//div[@class='sc-1e4no8h-4 hAlxgR'][2]/button/span[2]")
	WebElement logout;
	
	@FindBy(xpath="//button[@class='sc-sypgwv-6 kkbZLK']")
	WebElement confirm_logout_1;
	
	public void hover_profile_name()
	{
		hover_profile_name_1.click();
		hover_profile_name_1.click();
		
	}
	public void view_your_profile()
	{
		view_your_profile_1.click();
	}
	public void logout()
	{
		logout.click();
	}
	public void confirm_logout()
	{
		confirm_logout_1.click();
	}
	public Tc12_Login_Page_Search_Flight_Logout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
