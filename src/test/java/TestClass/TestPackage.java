package TestClass;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPackage {
	
	
	
	@BeforeMethod
	public void Beforemethod()
	{
		Reporter.log("This is Before test Method");
	}
	
	
	
	@Test(invocationCount=5)
	public void A()
	{
		Reporter.log("This is test A Method");
	}
	
	@Test(priority=1)
	public void B()
	{
		Reporter.log("This is test B Method");
	}
	
	@Test(dependsOnMethods="B")
	public void C()
	{
		Reporter.log("This is test C Method");
	}
	
	@Test(timeOut=1000)
	public void D()
	{
		Reporter.log("This is test D Method");
	}
	
	@Test(groups="E")
	public void E()
	{
		Reporter.log("This is test E Method");
	}
	
	@Test
	public void F()
	{
		Reporter.log("This is test F Method");
	}
	
	@AfterMethod
	public void Aftermethod()
	{
		Reporter.log("This is After test Method");
	}
	
	
	
	

}
