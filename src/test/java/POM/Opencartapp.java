package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencartapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		//driver.close();
		
		
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("AJAY");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("AJAY");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Rokade");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("ajayroakde0012gmail.com");
		Thread.sleep(2000);
		
		
		WebElement dropdownbox = driver.findElement(By.xpath("//select[@id='input-country']"));
		
		dropdownbox.click();
		
		Select s=new Select(dropdownbox);
		
		//s.selectByIndex(4);
		//Thread.sleep(2000);
	   // s.selectByVisibleText("India");
		s.selectByValue("15");
		Thread.sleep(2000);
		
		System.out.println("isMultiple state is " +s.isMultiple());
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='input-password']"));
		pwd.sendKeys("Ajayrokade451254");
		Thread.sleep(2000);
		
		driver.close();
		
		

	}

}
