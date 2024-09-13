package Airline_Application.Project_2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class {
	WebDriver driver;
	@BeforeMethod
	
	public void launch_url()
	{
		driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    

	}
	
	
	/*
	 * @AfterMethod public void after_method() throws InterruptedException {
	 * Thread.sleep(2000); driver.quit(); }
	 */
	
}
