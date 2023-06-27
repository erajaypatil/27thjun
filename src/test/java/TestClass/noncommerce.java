package TestClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class noncommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.edgedriver().setup();
		//System.setProperty("webdriver.msedgedriver.driver","C:\\selinium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox.sendKeys("Ajayrokade");
		searchbox.clear();
		searchbox.sendKeys("AJAYROKADE");
		
		
		WebElement footer = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		footer.getText();
		System.out.println("GetText is " + footer.getText());
		
		List<WebElement> footer1 = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		footer1.size();
		System.out.println("Total element present in footer is " + footer1.size());
		
		driver.close();
		
		
		
		
	}

}
