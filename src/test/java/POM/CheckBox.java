package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://itera-qa.azurewebsites.net/home/automation");
	    
	    driver.manage().window().maximize();
	    
	//    WebElement monday = driver.findElement(By.xpath("//label[normalize-space()='Monday']"));
	//    monday.click();
	 //   monday.isDisplayed();
	 //   monday.isEnabled();
	 //   monday.isSelected();
	  //  System.out.println("is displayed " + monday.isDisplayed());
	//    System.out.println("is enabled" + monday.isEnabled());
	 //   System.out.println("is selected " + monday.isSelected());
	    
	    
	 //   WebElement Tuesday = driver.findElement(By.xpath("//label[normalize-space()='Tuesday']"));
	 //   Tuesday.click();
	   
	    List<WebElement> listdays = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
	    listdays.size();
	    System.out.println("checkbox size " + listdays.size());
	    
	    
	/*    for(int i=0; i<=listdays.size(); i++)
	    {
	    	listdays.get(i).click();
	    }
	 
	  */  
	    
	    
	    for(WebElement vari:listdays)
	    {
	    	
	    	vari.click();
	    	
	    }
	
	    Thread.sleep(2000);
	    driver.close();

	}

}
