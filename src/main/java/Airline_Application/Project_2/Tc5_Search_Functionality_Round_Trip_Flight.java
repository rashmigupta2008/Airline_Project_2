package Airline_Application.Project_2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc5_Search_Functionality_Round_Trip_Flight {
	WebDriver driver;
	
	@FindBy(xpath="(//span[@class='sc-12foipm-70 bWWMhV'])[1]")
	WebElement round_trip;
	
	@FindBy(xpath="(//span[@class='sc-12foipm-8 eXKWBG fswDownArrow'])[2]")
	WebElement return_date;
	
	@FindBy(xpath="//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	WebElement forwand_arrow;
	
	@FindBy(xpath="//div[@aria-label='Thu Oct 10 2024']")
	WebElement select_journey_date;
	
	public void select_round_trip_radio_button() 
	{
		round_trip.click();
	}
	
	public void return_date_select() 
	{
		return_date.click();
	}
	
	public void click_arrow()
	{
		forwand_arrow.sendKeys(Keys.ENTER+" " +Keys.ENTER);
	}
	
	public void journey_date()
	{
		select_journey_date.click();
	}
	
	public Tc5_Search_Functionality_Round_Trip_Flight(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
