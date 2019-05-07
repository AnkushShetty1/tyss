import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FailSS {
	@Test
	public void run() {
		System.out.println("test method");
//		Assert.fail();
	}
	
	@AfterMethod
	public void afterMethod(ITestResult r) {
		//To print current method name
//		System.out.println(r.getMethod().getMethodName());
		
		if(r.getStatus()==ITestResult.FAILURE) {
			System.out.println("Takes screenshots");
		}else {
			System.out.println("nothing");
		}
	}

}
