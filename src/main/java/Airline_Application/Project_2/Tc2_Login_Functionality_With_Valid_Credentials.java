package Airline_Application.Project_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import project_2_DDT.Excelsheet;

public class Tc2_Login_Functionality_With_Valid_Credentials extends Excelsheet {
	WebDriver driver;
	
	@FindBy(xpath="//input[@class='loginCont__input']")
	WebElement enter_mobile_no;
	
	@FindBy(xpath="//button[@class='sc-dhKdcB cYwnDu  ']")
	WebElement click_continue;
	
	public void enter_your_mobile_number()
	{
		enter_mobile_no.clear();
		enter_mobile_no.sendKeys("8279486216");
	}
	
	public void click_to_continue()
	{
		click_continue.click();
	}
	public Tc2_Login_Functionality_With_Valid_Credentials(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
