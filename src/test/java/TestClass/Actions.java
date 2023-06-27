package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions {
	
	public static void main(String[] args) throws InterruptedException {
		
	//	System.setProperty("webdriver.chrome.driver","C:\\selinium\\chromedriver_win32 (2)\\chromedriver.exe");
	//	WebDriver driver=new ChromeDriver();
		
		
	//	System.setProperty("webdriver.firefox.driver","C:\\selinium\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
	//	WebDriver driver=new FirefoxDriver();
		
		WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.msedgedriver.driver","C:\\selinium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver2=new EdgeDriver();
		
		driver2.get("https://www.opencart.com/");
		driver2.manage().window().maximize();
		driver2.getCurrentUrl();
		System.out.println("This is currenturl" +driver2.getCurrentUrl());
		driver2.getPageSource();
		System.out.println("This is pageSource" +driver2.getPageSource());
		driver2.getTitle();
		System.out.println("This is getTitle " +driver2.getTitle());
		Thread.sleep(2000);
		
		WebElement search = driver2.findElement(By.xpath("//input[@placeholder='Enter your email address']"));
		search.isDisplayed();
		System.out.println("Searchbox is selected " + search.isDisplayed());
		search.isEnabled();
		System.out.println("searchbox is enabled " + search.isEnabled());
		Thread.sleep(2000);
		WebElement feature = driver2.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[normalize-space()='Features']"));
		feature.click();
		Thread.sleep(2000);
		driver2.navigate().back();
		Thread.sleep(2000);
		driver2.navigate().forward();
		Thread.sleep(2000);
		driver2.navigate().refresh();
		Thread.sleep(2000);
		
		
		driver2.close();
		
		
		
		
	}
	



	



	
	
	   
	   
	   
}
		
		
		
		
	

