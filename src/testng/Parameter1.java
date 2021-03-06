package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {
	public WebDriver driver;
	 
	@BeforeSuite
	public void launchApp(){
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/login.do");
	}
	
	@Test
	@Parameters({"username","password"})
	public void test(String s,String s2) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(s);
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys(s2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='Login '])")).click();
	}

}
