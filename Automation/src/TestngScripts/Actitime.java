package TestngScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.LoginPage;

public class Actitime {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void actitimelogin() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage lp=new LoginPage(driver);
		lp.getUntbx().sendKeys("admin");
		Thread.sleep(3000);
		driver.navigate().refresh();
		lp.getUntbx().sendKeys("admin");
		lp.getPwtbx().sendKeys("manager");
		lp.getLgbtn().click();
		Thread.sleep(5000);
		driver.close();
	}
	
	

}
