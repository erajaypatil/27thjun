package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googlepractice {
	
	WebDriver driver;
	@BeforeMethod
	public void A() throws InterruptedException
	{
		System.setProperty("webdriver.chorme.driver","C:\\selinium\\ChromeDriver\\chromedriver_win32 (3)\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void B()
	{
		WebElement search = driver.findElement(By.xpath("//div[@class='SDkEP']"));
		search.isDisplayed();
		search.isEnabled();
		System.out.println("searchbox google is displayed" +search );
		System.out.println("searchbox google is Enabled " +search );
		
		Assert.assertEquals(search, "search");
		
	}
	
	@Test
	public void GoogleText()
	{
		WebElement text = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
		text.getText();
		text.isDisplayed();
		System.out.println("google txt is displayed " + text);
		System.out.println("google text is " + text);
		
		Assert.assertEquals(text,"Google Search");
	}
	
	@AfterMethod
	public void c()
	{
		driver.quit();
	}

}
