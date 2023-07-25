package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FACEBOOK {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.partialLinkText("Create")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("firstname")).sendKeys("Qspider");
	driver.findElement(By.name("lastname")).sendKeys("Jspider");
	driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
	driver.findElement(By.id("password_step_input")).sendKeys("prospider");
	Thread.sleep(5000);
	driver.close();
	
	
	
	
	
	
	
}
}
