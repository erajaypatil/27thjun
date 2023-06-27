package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnontationStudy1 {
	
	
	
	
	@Test
	public void a()
	{
		Reporter.log("Running A Method");
	}
	@Test
	public void c()
	{
		Reporter.log("Running C Method");
	}
    
	@Test
	public void b()
	{
		Reporter.log("Running B Method");
	}
	
	@Test
	public void d()
	{
		Reporter.log("Running D Method");
	}


}
