package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.name("search_query")).sendKeys("kesariya");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
