package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetry2 {
	@Test
	public void run() {
		
		Assert.fail();
		System.out.println("running test method");
	}

}
