package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocationMethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
Thread.sleep(2000);
	String tagname = driver.findElement(By.xpath("//i[@aria-label='Instagram']")).getTagName();
	System.out.println(tagname);
         driver.close();
	}

}
