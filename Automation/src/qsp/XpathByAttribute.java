package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("mumbai indians");
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//yt-formatted-string[text()='Tuesday Motivation ft. WPL']")).click();
}
}
