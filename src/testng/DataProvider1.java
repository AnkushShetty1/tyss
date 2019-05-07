package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	public WebDriver driver;
	 
	@BeforeSuite
	public void launchApp(){
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/login.do");
	}
	 
	@Test(dataProvider = "getData")
	public void testSenchaLogin(String Username, String Password) throws InterruptedException{
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Username);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(Password);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[text()='Login '])")).click();
	Thread.sleep(3000);
	Assert.assertTrue(driver.findElement(By.xpath("//span[@class='errormsg']")).isDisplayed(),"Login Failed");
	System.out.println("Login successful");
	}
	 
	@DataProvider
	public Object[][] getData(){
	Object[][] data = new Object[3][2];
	data[0][0] = "username1@gmail.com";
	data[0][1] = "pssword1";
	data[1][0] = "username3@gmail.com";
	data[1][1] = "password3";
	data[2][0] = "admin";
	data[2][1] = "manager";
	return data;
	}
	 
	@AfterSuite
	public void closeBrowser(){
	driver.quit();
	 }

}
