package POM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlethebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	// String singlewindow = driver.getWindowHandle();
	  
	 // System.out.println(driver.getWindowHandle());//CDwindow-890A9C33AEF5CE6246FBFD509C4E8B94
	                                               //CDwindow-2185B6FCABAA655CA2A78589ACEE42D0
	  
	  driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();//openn another window
	  
	  Set<String> windows = driver.getWindowHandles();//return multiple browser id 
	  
	  //first method iterator()

	  Iterator<String> it = windows.iterator();
	  
	  String partentwindow = it.next();
	  String childwindow = it.next();
	  
	  System.out.println( "parent window id " + partentwindow);
	  
	  System.out.println("child window id " + childwindow);
	  
	  driver.close();

	}

}
