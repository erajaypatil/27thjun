package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
	
	
	
	@Test
	public void Validuserid()
	{
		//System.out.println("running userid method");
		Reporter.log("running useridTest ", true);
	}
	
	@Test
	public void sampleTest()
	{
		//System.out.println("hi this is sample Test method");
		Reporter.log("Running sampleTest", true);
	}
	
	@BeforeMethod
	public void loginKite()
	{
		//System.out.println("hi this is loginkite method");
		Reporter.log("Loggin in Beforemethod",true);
	}
	@BeforeClass
	public void LaunchBrowser()
	{
		//System.out.println("hi this launchbrowser method");
		Reporter.log("LaunchBrowser BeforeClass ", true);
	}
	@AfterClass
	public void closerBrowser()
	{
		//System.out.println("hi this closebrowser method");
		
		Reporter.log("closing browser AfterCalss",true);
	}
	
	@AfterMethod
	public void logout()
	{
		//System.out.println("hi this logout method");
		Reporter.log("Loggin out AfterMethod...",true);
	}

}
