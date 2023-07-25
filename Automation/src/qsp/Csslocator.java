package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csslocator {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com");
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("input[name=\"pwd\"]")).sendKeys("Manager");
	Thread.sleep(5000);
}}