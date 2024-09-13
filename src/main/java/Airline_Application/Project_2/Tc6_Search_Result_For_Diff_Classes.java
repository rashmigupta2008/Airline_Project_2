package Airline_Application.Project_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc6_Search_Result_For_Diff_Classes {
	
	WebDriver driver;
	@FindBy(xpath="(//p[@class='sc-12foipm-4 czGBLf fswWidgetTitle'])[2]")
	WebElement travellers_class;
	
	@FindBy(xpath="(//span[@class='sc-12foipm-51 kZvHQU'])[2]")
	WebElement adult_number;
	
	@FindBy(xpath="(//span[@class='sc-12foipm-51 kZvHQU'])[4]")
	WebElement children_number;
	
	@FindBy(xpath="//li[@class='sc-12foipm-46 jva-DHv']")
	WebElement travel_class;
	
	@FindBy(xpath="//a[@class='sc-12foipm-64 jkgFUQ']")
	WebElement done_button;
	
	public void number_of_travellers_and_select_class() {
		travellers_class.click();
		
	}
	public void number_of_adult() {
		adult_number.click();;
		
	}
	public void number_of_children() {
		children_number.click();
		
	}
	public void travel_class() {
		travel_class.click();
		
	}
	public void done_button_click() {
		done_button.click();
		
	}
	public Tc6_Search_Result_For_Diff_Classes(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
