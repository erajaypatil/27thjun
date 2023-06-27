package POM;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazoncom {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\selinium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		//List<WebElement> links = driver.findElements(By.tagName("script"));
		
	   // System.out.println("Total links is " + links );
		
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		search.isDisplayed();
		
		search.isEnabled();
		
		search.isSelected();
		
		System.out.println("search box is displayed " +search.isDisplayed());
		
		System.out.println("search box is enbaled " + search.isEnabled());
		
		System.out.println("search box is displayed " + search.isSelected());
		
		Thread.sleep(2000);
		
		WebElement AmazonMiniTV = driver.findElement(By.xpath("//a[normalize-space()='Amazon miniTV']"));
		
		
		AmazonMiniTV.isDisplayed();
		AmazonMiniTV.isEnabled();
		AmazonMiniTV.isSelected();
		System.out.println("AmazonMiniTV is displaed " + AmazonMiniTV.isDisplayed());
		System.out.println("AmazonMiniTV is Enabled "  + AmazonMiniTV.isEnabled() );
		System.out.println("AmazonMiniTV.isSelected " + AmazonMiniTV.isSelected());
		
		AmazonMiniTV.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
WebElement s = driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']"));
	s.isDisplayed();
	s.isEnabled();
	s.isSelected();
	System.out.println("s is displayed" + 	s.isDisplayed());
	System.out.println("s is Enabled" + 	s.isEnabled());
	System.out.println("s is selected " +  s.isSelected());

	

File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

File dest=new File("C:\\selinium\\screenShot\\amazon.png");

FileHandler.copy(scr,dest);

	Thread.sleep(2000);
	
	driver.close();
		
	
		
		

	}

}
