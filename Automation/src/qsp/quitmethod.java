package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitmethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//span[.='Apple iPhone 14 (128 GB) - Blue'])[1]")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
