package testng;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	int count=0;
	int max_count=9;

	@Override
	public boolean retry(ITestResult result) {
		
		if(count<max_count) {
			count++;
			return true;
		}
		return false;
	}

}
