package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google {
	
	
	WebDriver driver;
	@BeforeMethod
	public void A() throws InterruptedException
	{
		System.setProperty("webddriver.chrome.driver","C:\\selinium\\ChromeDriver\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		
	}
	
	@Test
	public void B()
	{
       String title=driver.getTitle();
       System.out.println(title);
       Reporter.log("This is 1st Test case pass ");
	}
	
	@Test
	public void GoogleText()
	{
		boolean b=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		Reporter.log("This is 2nd Test case pass ");
		
		
	}
	
	@Test
	public void link()
	{
		boolean c=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).isDisplayed();
		Reporter.log("This is 3rd Test case pass");
	}
	
	
	@AfterMethod
	public void c()
	{
		driver.quit();
		
	}

}
