import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogDemo {

private static WebDriver driver = null;

public static void main(String[] args) {

// Create a new instance of the Firefox driver
driver = new ChromeDriver();

// Hit the URL for which you want to see logs
driver.get("https://www.google.co.in/");

// Create reference variable “log” referencing getLogger method of Logger class, it is used to store logs in selenium.txt
Logger log = Logger.getLogger("devpinoyLogger");

// Call debug method with the help of referencing variable log and log the information in test.logs file
log.debug("Getting errors");

}

}