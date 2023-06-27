
package TestClass;

import org.testng.annotations.Test;

public class Add {

	@Test(invocationCount=10)
	public void sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println("Total sum is " + c);
	}
	
	@Test(priority=1)
	public void min()
	{
		System.out.println("This is min method");
	}
	
	
}
