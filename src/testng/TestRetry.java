package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetry {
	
	@Test(retryAnalyzer=testng.RetryAnalyzer.class)
	public void run() {
		
		Assert.fail();
		System.out.println("running test method");
	}

}
