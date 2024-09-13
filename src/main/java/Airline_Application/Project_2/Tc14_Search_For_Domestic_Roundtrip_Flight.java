package Airline_Application.Project_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc14_Search_For_Domestic_Roundtrip_Flight {
	WebDriver driver;
	
	@FindBy(xpath="(//p[.='Enter city or airport'])[1]")
	WebElement source_airport;
	
	@FindBy(xpath="(//p[.='Enter city or airport'])[2]")
	WebElement destination_airport;
	
	public void source_airport1() throws InterruptedException
	{
		  source_airport.sendKeys("hyderabad");
		  Thread.sleep(2000); 
		  List<WebElement> source_autosuggestion=driver.findElements(By.xpath("//div[@class='sc-12foipm-24 bDSkOK']/ul/li")); 
		  int count=source_autosuggestion.size();
		  source_autosuggestion.get(count-8).sendKeys(Keys.ENTER);
	}
	
	public void destination_airport1() throws InterruptedException
	{
		 destination_airport.sendKeys("bengalore");
		 Thread.sleep(2000); 
		 List<WebElement> destination_autosuggestion=driver.findElements(By.xpath("//div[@class='sc-12foipm-24 bDSkOK']/ul/li")); 
		 int count=destination_autosuggestion.size();
		 destination_autosuggestion.get(count-8).sendKeys(Keys.ENTER);
	}
	
	public Tc14_Search_For_Domestic_Roundtrip_Flight(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
