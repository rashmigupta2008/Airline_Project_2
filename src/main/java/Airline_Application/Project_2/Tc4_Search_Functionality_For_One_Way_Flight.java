package Airline_Application.Project_2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc4_Search_Functionality_For_One_Way_Flight {
	WebDriver driver;

	@FindBy(xpath="//span[@class='sc-12foipm-70 fPPRk']")
	WebElement one_way;
	
	@FindBy(xpath="(//p[.='Enter city or airport'])[1]")
	WebElement source_airport;
	
	@FindBy(xpath="(//p[.='Enter city or airport'])[2]")
	WebElement destination_airport;
	
	@FindBy(xpath="(//p[@class='sc-12foipm-4 czGBLf fswWidgetTitle'])[1]")
	WebElement select_departure_date;
	
	@FindBy(xpath="//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	WebElement forwand_arrow;
	
	@FindBy(xpath="//div[@aria-label='Tue Oct 01 2024']")
	WebElement select_journey_date;
	
	@FindBy(xpath="//div[@aria-label='Tue Oct 01 2024']")
	WebElement search_button;
	
	public void one_way_radio_button() throws InterruptedException
	{
		
		one_way.click();
	}
	
	public void write_source_airport() throws InterruptedException
	{
		
		source_airport.sendKeys("hyderabad");
		 Thread.sleep(2000); 
		  List<WebElement> source_autosuggestion=driver.findElements(By.xpath("//div[@class='sc-12foipm-24 bDSkOK']/ul/li")); 
		  int count=source_autosuggestion.size();
		  source_autosuggestion.get(count-8).sendKeys(Keys.ENTER);
	}          
	
	public void write_destination_airport() throws InterruptedException
	{
		
		destination_airport.sendKeys("germany");
		 Thread.sleep(2000); 
		  List<WebElement> destination_autosuggestion=driver.findElements(By.xpath("//div[@class='sc-12foipm-24 bDSkOK']/ul/li")); 
		  int count=destination_autosuggestion.size();
		  destination_autosuggestion.get(count-8).sendKeys(Keys.ENTER);
	}
	
	public void departure_date()
	{
		select_departure_date.click();
	}
	
	public void click_arrow()
	{
		forwand_arrow.sendKeys(Keys.ENTER+" " +Keys.ENTER);
	}
	
	public void journey_date()
	{
		select_journey_date.click();
	}
	
	public void search_button_click()
	{
		search_button.click();
	}
	public Tc4_Search_Functionality_For_One_Way_Flight(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

}
