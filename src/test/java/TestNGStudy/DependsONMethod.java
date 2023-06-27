package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsONMethod {
	
	
	
	@Test(dependsOnMethods= {"c"})
	public void a()
	{
		Reporter.log("Running A Method",true);
	}
	
	@Test(timeOut=1000)
	public void c() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("Running C Method",true);
	}
	
	@Test
	public void b()
	{
		Reporter.log("Running B Method",true);
	}

}
