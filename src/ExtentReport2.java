import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport2 {
	public static void main(String[] args) {
		ExtentHtmlReporter rep = new ExtentHtmlReporter("D:\\Qspider-java\\Selenium\\TYSS-Practice\\extrep.html");
		rep.config().setDocumentTitle("Automation Testing");
		rep.config().setTheme(Theme.DARK);
		rep.config().setReportName("Regression tests");
		
		ExtentReports ext = new ExtentReports();
		ext.attachReporter(rep);
		
		ExtentTest test =ext.createTest("test1");//test method name
		test.log(Status.INFO, "Report is workin fine");//INFO to print some message
		test.log(Status.PASS, "test is passed");
		ext.flush();//To publish the reports
	}

}
