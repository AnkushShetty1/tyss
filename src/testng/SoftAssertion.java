package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	SoftAssert sa = new SoftAssert();
	@Test
	public void run() {
		sa.assertEquals("hello", "hello");
		Reporter.log("passed",true);
		
		sa.assertEquals("hello", "hi");
		Reporter.log("failed",true);
		sa.assertAll();
		
		Reporter.log("both have actual and expected value same",true);
	}
	
	@Test
	public void run1() {
		Reporter.log("hsdchdsd",true);
	}

}
