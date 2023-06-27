package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iterapractice {

	WebDriver driver;
	
	@BeforeMethod
	public void BeforeClass()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selinium\\chromedriver_win32 (2)//chromedriver.exe");
	    driver=new ChromeDriver();
	  //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://itera-qa.azurewebsites.net/");
	    
	}
	
	
	@Test
	public void textarea() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='btn btn-link']")).click();
		Thread.sleep(2000);
		WebElement fn = driver.findElement(By.xpath("//input[@id='FirstName']"));
		Thread.sleep(2000);
		fn.sendKeys("AJAY ROKADE");
		Thread.sleep(2000);
		fn.clear();
		fn.isEnabled();
	/*	System.out.println("fn is enabled or not " +fn.isEnabled());
		WebElement sn = driver.findElement(By.xpath("//input[@id='Surname']"));
		sn.sendKeys("ROKADE DESHMUKH");
		sn.clear();
		sn.sendKeys("AJAY");
		sn.isDisplayed();
		sn.isSelected();
		sn.isEnabled();
		System.out.println("is displayed " + sn.isDisplayed());
		System.out.println("is selected " + sn.isSelected());
		System.out.println("is Enabled "  + sn.isEnabled());
		WebElement epost = driver.findElement(By.xpath("//input[@id='E_post']"));
		WebElement mobile = driver.findElement(By.xpath("//input[@id='Mobile']"));
		WebElement un = driver.findElement(By.xpath("//input[@id='Username']"));
		WebElement pwd = driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement cpwd = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
	*/	
		
	}
	
	@AfterMethod
	public void afterClass()
	{
		driver.close();
	}
	
	
	
	
	
	

}
