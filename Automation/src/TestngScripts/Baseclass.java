package TestngScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Baseclass {
	
	public static WebDriver driver;
	@BeforeSuite
	public void databaseConnection() {
		Reporter.log("database connected",true);
	}
	@BeforeTest
	public void launchBrowser() {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Reporter.log("browser is launched",true);
	}
	@BeforeMethod
	public void login() {
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Reporter.log("logged in successfully",true);
		
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("logout successfully",true);	
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		Reporter.log("Browser closed successfully",true);
	}
	@AfterSuite
	public void databaseDisconnection() {
		Reporter.log("database disconnected ",true);
	}
	
}
