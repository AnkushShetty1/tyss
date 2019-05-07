import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport4 {
	public static void main(String[] args) {
		ExtentHtmlReporter rep = new ExtentHtmlReporter("D:\\Qspider-java\\Selenium\\TYSS-Practice\\extrep.html");
		
		ExtentReports ext = new ExtentReports();
		ext.attachReporter(rep);
		
		ExtentTest test1 =ext.createTest("test1");//test method name
		test1.log(Status.INFO, "Report is workin fine");//INFO to print some message
		test1.log(Status.PASS, "test is passed");
		
		ExtentTest test2 =ext.createTest("test2");//test method name
		test2.log(Status.INFO, "Report is workin fine");//INFO to print some message
		test2.log(Status.FAIL, "test is failed");
		
		ext.flush();//To publish the reports
	}

}
