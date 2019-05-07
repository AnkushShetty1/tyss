package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertion {
	@Test
	public void run() {
		Assert.assertEquals("hello", "hello");
		Reporter.log("passed",true);
		
		Assert.assertEquals("hello", "hi");
		Reporter.log("failed",true);
		
		Reporter.log("both have actual and expected value same",true);
	}
	
	@Test
	public void run1() {
		Reporter.log("hsdchdsd",true);
	}

}
