package GroupingInTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGroup1 {
	
	@Test(groups="Regression")
	public void TC1()
	{
		Reporter.log("Running TC1 ",true);
	}
	
	

	@Test
	public void TC2()
	{
		Reporter.log("Running TC2 ",true);
	}
	

	@Test(groups="Sanity")
	public void TC3()
	{
		Reporter.log("Running TC3 ",true);
	}
	

	@Test(groups="Sanity")
	public void TC4()
	{
		Reporter.log("Running TC4 ",true);
	}
	

	@Test
	public void TC5()
	{
		Reporter.log("Running TC5 ",true);
	}

}
