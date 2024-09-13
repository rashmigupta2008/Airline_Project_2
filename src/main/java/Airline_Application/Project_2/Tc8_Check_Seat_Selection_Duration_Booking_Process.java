package Airline_Application.Project_2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Tc8_Check_Seat_Selection_Duration_Booking_Process {
	
	WebDriver driver;
	
	@FindBy(xpath="(//span[text()='1 Stop'])")
	WebElement one_stop;
	
	@FindBy(xpath="(//button[text()='VIEW FARES'])[1]")
	WebElement view_fares_1;
	
	@FindBy(xpath="(//span[text()='Meal'])")
	WebElement meal;
	
	@FindBy(xpath="(//div[text()='Chargeable'])[2]")
	WebElement chargable_meal;
	
	@FindBy(xpath="(//div[text()='Paid seats only'])[2]")
	WebElement paid_seat;
	
	@FindBy(xpath="(//div[text()='Standard seat included; non-standard seats chargeable'])")
	WebElement seat_chargable;
	
	@FindBy(xpath="(//span[text()='Check-in baggage'])[2]")
	WebElement check_in_baggage;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	WebElement book_ticket;
	
	@FindBy(xpath="//div[text()='Personal']")
	WebElement personal_info;
	
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement proceed;
	
	public void one_stop() throws InterruptedException
	{
		Thread.sleep(3000);
		one_stop.click();
	}
	public void view_fares() throws InterruptedException
	{
		Thread.sleep(10000);
		view_fares_1.click();
	}
	public void meal()throws InterruptedException
	{
		Thread.sleep(3000);
		meal.click();
	}
	public void chargable_meal()throws InterruptedException
	{
		Thread.sleep(3000);
		chargable_meal.click();
	}
	public void paid_seat()throws InterruptedException
	{
		Thread.sleep(3000);
		paid_seat.click();
	}
	public void seat_chargable()throws InterruptedException
	{
		Thread.sleep(3000);
		seat_chargable.click();
	}
	public void check_in_baggage()throws InterruptedException
	{
		Thread.sleep(3000);
		check_in_baggage.click();
	}
	
	public void switchtochildWindow(WebDriver driver) {
		String window =driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> winpop = windows.iterator();
		String parentid = winpop.next();
		String childid = winpop.next();
		driver.switchTo().window(childid);
	}

	public void book_ticket(WebDriver driver) throws InterruptedException
	{
		
		book_ticket.click();
		Thread.sleep(3000);
		switchtochildWindow(driver);
		
		
	}
//	public void switchwindow(WebDriver driver)
//	{
//	
//		Set<String> windows = driver.getWindowHandles();
//		Iterator<String> win_pop = windows.iterator();
//		String firstwindow= win_pop.next();
//		String secondwindow = win_pop.next();
//		driver.switchTo().window(secondwindow);
//		
//	}
	public void personal_info()
	{
		personal_info.click();
	}
	public void validate_chargable_meal()
	
	{
		String text=chargable_meal.getText();
		System.out.println(text);
		Assert.assertEquals(text, "Chargeable", "meal is not charged");
		//Assert.assertEquals(chargable_meal, true, "meal is not charged");
	}
	public void validate_check_in_baggage()
	{
		
		System.out.println(check_in_baggage.getText());
		Assert.assertEquals(check_in_baggage.getText(),"Check-in baggage", "check_in baggage is not charged");
	}
	
	public void validate_view_fares()
	{
		
		System.out.println(view_fares_1.getText());
		Assert.assertEquals(view_fares_1.getText(),"VIEW ", "check_in baggage is not charged");//VIEW FARES
	}
	public void proceed(WebDriver driver) throws InterruptedException
	{
		Point p1=proceed.getLocation();
		int y=p1.getY();
		JavascriptExecutor j1=(JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(2000);
		proceed.click();
		Thread.sleep(3000);
		switchtochildWindow(driver);
	}
	
	public void Tc8_Check_Seat_Selection_Duration_Booking_Process(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
