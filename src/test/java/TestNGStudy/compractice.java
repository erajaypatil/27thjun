package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class compractice {
	
	 WebDriver driver;
	
	@BeforeClass
	public void Page1() throws InterruptedException
	{
		System.out.println("hi this is page1");
		
		System.setProperty("webdriver.chrome.driver","C:\\selinium\\chromedriver_win32 (2)\\chromedriver.exe");
		
	 driver= new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
			Thread.sleep(2000);
	}
	
	@BeforeMethod
	public void page2() throws InterruptedException
	{
		System.out.println("hi this is page2");
		
		//driver.get("https://itera-qa.azurewebsites.net/home/automation");
		Thread.sleep(2000);
	}
	
	@Test
	public void Login()
	{
        		
		System.out.println("hi this is test login method");
	}
	@AfterMethod
	public void page3() throws InterruptedException
	{
		System.out.println("hi this is page3");
		Thread.sleep(2000);
		
	
	}
	
	@AfterClass
	public void page4() throws InterruptedException
	{
		System.out.println("hi this is page4");
		Thread.sleep(2000);	
		
	}
	

}
