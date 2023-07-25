package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tinder.com/");
	Thread.sleep(5000);
	  List<WebElement> value = driver.findElements(By.xpath("//h1[.='Start something epic.']"));
System.out.println(value);
Thread.sleep(5000);
driver.close();
}
}
