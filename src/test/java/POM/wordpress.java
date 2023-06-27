package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wordpress {
	
	@FindBy(xpath="//span[@class='x-icon x-icon--menu']")private WebElement login;
	@FindBy(xpath="//a[@class='x-menu-link x-link'][normalize-space()='Log In']")private WebElement login1;
	@FindBy(xpath="//input[@id='usernameOrEmail']")private WebElement un;
	@FindBy(xpath="//button[normalize-space()='Continue']")private WebElement button;
	@FindBy(xpath="//input[@id='password']")private WebElement pwd;
	@FindBy(xpath="//button[normalize-space()='Log In']")private WebElement Button1;
	public wordpress(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginpage()
	{
		login1.click();
	}
	

}
