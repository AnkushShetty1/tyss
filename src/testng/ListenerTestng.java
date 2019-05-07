package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

//@Listeners(testng.Listeners1.class)
public class ListenerTestng {
	@Test
	public void run() {
		System.out.println("test method");
	}
	
	@Test
	public void run1() {
		System.out.println("test method 1");
		Assert.fail();
		
	}

}
