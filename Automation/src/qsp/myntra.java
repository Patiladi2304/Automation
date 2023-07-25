package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Jspiders%20thane1/Desktop/WEBPAGE.html");
	driver.findElement(By.id("pappu")).click();
	Thread.sleep(5000);
	driver.close();
}
}
