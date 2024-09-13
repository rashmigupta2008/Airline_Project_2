package Airline_Application.Project_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc7_Search_For_Multicity_Flight {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[@class='sc-12foipm-70 fPPRk']")
	WebElement multicity_option;
	
	@FindBy(xpath="(//p[.='Enter city or airport'])[3]")
	WebElement enter_source_city;
	
	@FindBy(xpath="(//p[.='Enter city or airport'])[4]")
	WebElement enter_destination_city;
	
	@FindBy(xpath="(//p[@class='sc-12foipm-6 erPfRs'])[4]")
	WebElement enter_date;
	
	@FindBy(xpath="(//p[@class='sc-12foipm-6 erPfRs'])[4]")
	WebElement forward_arrow;
	
	@FindBy(xpath="//p[.='31']")
	WebElement date;
	
	public void select_multicity_option() 
	{
		multicity_option.click();
	}
	
	public void enter_the_source_city() throws InterruptedException
	{
		enter_source_city.sendKeys("bengalore");
		Thread.sleep(2000);
		 List<WebElement> source_autosuggestion=driver.findElements(By.xpath("//div[@class='sc-12foipm-24 bDSkOK']/ul/li")); 
		  int count1=source_autosuggestion.size();
		  source_autosuggestion.get(count1-8).sendKeys(Keys.ENTER);
	}
	
	public void enter_the_destination_city() 
	{
		enter_destination_city.sendKeys("delhi");
		List<WebElement> destination_autosuggestion=driver.findElements(By.xpath("//div[@class='sc-12foipm-24 bDSkOK']/ul/li"));
		int count2=destination_autosuggestion.size();
		destination_autosuggestion.get(count2-9).sendKeys(Keys.ENTER);
	}
	
	public void select_date() 
	{
		enter_date.click();
	}
	
	public void select_forward_arrow() 
	{
		forward_arrow.sendKeys(Keys.ENTER+""+Keys.ENTER+""+Keys.ENTER);
	}
	
	public void date_31() 
	{
		date.click();
	}
	
	public Tc7_Search_For_Multicity_Flight(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
