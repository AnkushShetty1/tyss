package testng;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class MultiRetry {
	public static void main(String[] args) {
		
		TestNG t = new TestNG();
		List l = new ArrayList<>();
		l.add("D:\\Qspider-java\\Selenium\\TYSS-Practice\\test-output\\testng-failed.xml");
		t.setTestSuites(l);
		t.run();
	}

}
