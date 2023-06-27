package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkartSoftware {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriverManager.chromedriver().setup();
         
         WebDriver driver=new ChromeDriver();

         driver.manage().window().maximize();

         driver.get("https://www.flipkart.com/");
         
         WebElement popUp = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));

         popUp.click();
         
         Thread.sleep(2000);
         
     //    WebElement links = driver.findElement(By.linkText("Grocery"));
         
       //  links.click();
         
       //  System.out.println("link name is " + links);
         
       //  WebElement link = driver.findElement(By.partialLinkText("Gro"));
         
        // link.click();
         
       //  System.out.println("partial Link text is " + link);
         
       List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
         
         totalLinks.size();
         
         System.out.println("Total link size is " + totalLinks.size());
         
         for(int i=0; i<=totalLinks.size();i++)
         {
        	
        	 System.out.println( totalLinks.get(i).getText());
        	// System.out.println(totalLinks.get(i).getAttribute("class"));
         }
         
         
         
	}

}
