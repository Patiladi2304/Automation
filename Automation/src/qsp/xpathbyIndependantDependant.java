package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyIndependantDependant {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s23 ultra");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("//span[.='Samsung Galaxy S23 Ultra 5G (Phantom Black, 12GB, 256GB Storage)']/../../../../../../../div[2]/div/div/div[3]/div[1]/div/div[1]/div[2]/a/span[1]/span[2]")).getText();
		System.out.println(price);
		Thread.sleep(5000);
        driver.close();
        }

}
